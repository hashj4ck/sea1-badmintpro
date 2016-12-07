package werkzeuge.subwerkzeuge.courtwerkzeug;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import materialien.Court;
import services.ServiceManager;
import services.observer.ServiceObserver;
import werkzeuge.abstraction.AbstractSubwerkzeug;
import werkzeuge.abstraction.Subwerkzeug;
import werkzeuge.observer.SubwerkzeugObserver;
import werkzeuge.subwerkzeuge.courtwerkzeug.anlegenoption.CourtWerkzeugAnlegen;
import werkzeuge.subwerkzeuge.courtwerkzeug.bearbeitenoption.CourtWerkzeugBearbeiten;
import werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption.TeilnehmerWerkzeugAnlegen;
import werkzeuge.subwerkzeuge.teilnehmerwerkzeug.bearbeitenoption.TeilnehmerWerkzeugBearbeiten;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.fxml
 * @since 19.11.2016 , 22:19:52
 *
 */
public class CourtWerkzeug extends AbstractSubwerkzeug {

	CourtWerkzeugUI _ui;
	CourtWerkzeugAnlegen _anlegenOption;
	CourtWerkzeugBearbeiten _bearbeitenOption;

	/**
	 * Ueberschreiben der Methode registriereUIAktionen in der Klasse
	 * TeilnehmerWerkzeug. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#registriereUIAktionen()
	 */
	@Override
	public void registriereUIAktionen() {

		_ui.get_anlegenButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				setzeSubwerkzeug(_anlegenOption);

			}
		});

		_ui.get_loeschenButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				Court court = _ui.get_tableCourts().getSelectionModel().getSelectedItem();

				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Warnung!");
				alert.setHeaderText("Sie sind dabei das ausgewählte Element zu entfernen!");
				alert.setContentText("Sind sie sicher, dass sie mit dieser Operation fortfahren möchten?");

				alert.getButtonTypes().add(new ButtonType("Abbrechen", ButtonData.CANCEL_CLOSE));

				Optional<ButtonType> result = alert.showAndWait();
				if (result.get() == ButtonType.OK) {
					ServiceManager.courtservice().entferneCourt(court);
				}

			}
		});

		_ui.get_bearbeitenButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (_ui.get_tableCourts().getSelectionModel().getSelectedItem() != null) {
					_bearbeitenOption.setzeCourt(_ui.get_tableCourts().getSelectionModel().getSelectedItem());
					setzeSubwerkzeug(_bearbeitenOption);
				}

			}
		});

		_ui.get_searchButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				starteSuchfunktion();

			}
		});

		_ui.get_searchTextfield().setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if (event.getCode().equals(KeyCode.ENTER)) {
					starteSuchfunktion();
				}

			}
		});

	}

	/**
	 * Ueberschreiben der Methode registriereListener in der Klasse
	 * TeilnehmerWerkzeug. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#registriereListener()
	 */
	@Override
	public void registriereListener() {
		ServiceManager.courtservice().registriereBeobachter(new ServiceObserver() {

			@Override
			public void reagiereAufAenderung() {
				_ui.get_tableCourts().setItems(ServiceManager.courtservice().getCourtObservableList());

			}
		});

		_anlegenOption.registriereBeobachter(new SubwerkzeugObserver() {

			@Override
			public void reagiereAufAenderung() {
				_ui.get_borderpane().setRight(null);
			}
		});

		_bearbeitenOption.registriereBeobachter(new SubwerkzeugObserver() {

			@Override
			public void reagiereAufAenderung() {
				_ui.get_borderpane().setRight(null);

			}
		});

	}

	/**
	 * Ueberschreiben der Methode getPane in der Klasse TeilnehmerWerkzeug. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#getPane()
	 */
	@Override
	public Pane getPane() {
		return _ui.getPane();
	}

	/**
	 * Ueberschreiben der Methode initialisiereLayout in der Klasse
	 * TeilnehmerWerkzeug. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.AbstractSubwerkzeug#initialisiereLayout(java.lang.String)
	 */
	@Override
	protected void initialisiereLayout() {
		_ui = (CourtWerkzeugUI) this.getFxml("fxml/CourtWerkzeugFxml.fxml");

		_ui.get_tableCourts().setItems(ServiceManager.courtservice().getCourtObservableList());
		_ui.get_columnName().setCellValueFactory(cellData -> cellData.getValue().get_name());
		_ui.get_columnBeschreibung().setCellValueFactory(cellData -> cellData.getValue().get_beschreibung());

		_anlegenOption = new CourtWerkzeugAnlegen();
		_bearbeitenOption = new CourtWerkzeugBearbeiten();

	}

	/**
	 * Ueberschreiben der Methode setzeSubwerkzeug in der Klasse Subwerkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Subwerkzeug#setzeSubwerkzeug(werkzeuge.abstraction.Subwerkzeug)
	 */
	@Override
	public void setzeSubwerkzeug(Subwerkzeug Subwerkzeug) {

		_ui.get_borderpane().setRight(Subwerkzeug.getPane());

	}

	/**
	 * Sucht nach Teilnehmern aus dem Teilnehmerservice heraus und setzt die
	 * Anzeige mit zutreffenden Ergebnissen. Die Suchfunktionen nimmt einen
	 * String aus dem Suchfeld entgegen und prüft ob Vorname, Nachname oder
	 * Emailadresse mit den String übereinstimmen.
	 */
	private void starteSuchfunktion() {
		if (_ui.get_searchTextfield().getText().equals("")) {
			_ui.get_tableCourts().setItems(ServiceManager.courtservice().getCourtObservableList());
		} else {
			List<Court> suchliste = new ArrayList<Court>();

			for (Court c : ServiceManager.courtservice().getCourtList()) {
				if (c.get_name().get().matches(".*" + _ui.get_searchTextfield().getText() + ".*")) {
					suchliste.add(c);
				}
			}

			_ui.get_tableCourts().setItems(FXCollections.observableArrayList(suchliste));
			_ui.get_searchTextfield().setText("");

		}
	}

}
