package werkzeuge.subwerkzeuge.teilnehmerwerkzeug;

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
import materialien.Teilnehmer;
import services.ServiceManager;
import services.observer.ServiceObserver;
import werkzeuge.abstraction.AbstractSubwerkzeug;
import werkzeuge.abstraction.Subwerkzeug;
import werkzeuge.observer.SubwerkzeugObserver;
import werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption.TeilnehmerWerkzeugAnlegen;
import werkzeuge.subwerkzeuge.teilnehmerwerkzeug.bearbeitenoption.TeilnehmerWerkzeugBearbeiten;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.fxml
 * @since 19.11.2016 , 22:19:52
 *
 */
public class TeilnehmerWerkzeug extends AbstractSubwerkzeug {

	TeilnehmerWerkzeugUI _ui;
	TeilnehmerWerkzeugAnlegen _anlegenOption;
	TeilnehmerWerkzeugBearbeiten _bearbeitenOption;

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

				Teilnehmer teilnehmer = _ui.get_tableTeilnehmer().getSelectionModel().getSelectedItem();

				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Warnung!");
				alert.setHeaderText("Sie sind dabei das ausgewählte Element zu entfernen!");
				alert.setContentText("Sind sie sicher, dass sie mit dieser Operation fortfahren möchten?");

				alert.getButtonTypes().add(new ButtonType("Abbrechen", ButtonData.CANCEL_CLOSE));

				Optional<ButtonType> result = alert.showAndWait();
				if (result.get() == ButtonType.OK) {
					ServiceManager.teilnehmerservice().entferneTeilnehmer(teilnehmer);
				}

			}
		});

		_ui.get_bearbeitenButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (_ui.get_tableTeilnehmer().getSelectionModel().getSelectedItem() != null) {
					_bearbeitenOption.setzeTeilnehmer(_ui.get_tableTeilnehmer().getSelectionModel().getSelectedItem());
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
		ServiceManager.teilnehmerservice().registriereBeobachter(new ServiceObserver() {

			@Override
			public void reagiereAufAenderung() {
				_ui.get_tableTeilnehmer().setItems(ServiceManager.teilnehmerservice().getTeilnehmerObservableList());

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
		_ui = (TeilnehmerWerkzeugUI) this.getFxml("fxml/TeilnehmerWerkzeugFxml.fxml");

		_ui.get_tableTeilnehmer().setItems(ServiceManager.teilnehmerservice().getTeilnehmerObservableList());
		_ui.get_columnNachname().setCellValueFactory(cellData -> cellData.getValue().get_nachname());
		_ui.get_columnVorname().setCellValueFactory(cellData -> cellData.getValue().get_vorname());
		_ui.get_columnEmail().setCellValueFactory(cellData -> cellData.getValue().getEmail());
		_ui.get_columnBezahlt().setCellValueFactory(cellData -> cellData.getValue().hatBezahlt());

		_anlegenOption = new TeilnehmerWerkzeugAnlegen();
		_bearbeitenOption = new TeilnehmerWerkzeugBearbeiten();

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
			_ui.get_tableTeilnehmer().setItems(ServiceManager.teilnehmerservice().getTeilnehmerObservableList());
		} else {
			List<Teilnehmer> suchliste = new ArrayList<Teilnehmer>();

			for (Teilnehmer t : ServiceManager.teilnehmerservice().getTeilnehmerList()) {
				if (t.get_nachname().get().matches(".*" + _ui.get_searchTextfield().getText() + ".*")
						|| t.get_vorname().get().matches(".*" + _ui.get_searchTextfield().getText() + ".*")
						|| t.getEmail().get().matches(".*" + _ui.get_searchTextfield().getText() + ".*")) {
					suchliste.add(t);
				}
			}

			_ui.get_tableTeilnehmer().setItems(FXCollections.observableArrayList(suchliste));
			_ui.get_searchTextfield().setText("");

		}
	}

}
