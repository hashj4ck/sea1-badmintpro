package werkzeuge.subwerkzeuge.teilnehmerwerkzeug;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import materialien.Teilnehmer;
import services.ServiceManager;
import services.observer.ServiceObserver;
import werkzeuge.abstraction.AbstractSubwerkzeug;
import werkzeuge.abstraction.Subwerkzeug;
import werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption.TeilnehmerWerkzeugAnlegen;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.fxml
 * @since 19.11.2016 , 22:19:52
 *
 */
public class TeilnehmerWerkzeug extends AbstractSubwerkzeug {

	TeilnehmerWerkzeugUI _ui;

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
				setzeSubwerkzeug(new TeilnehmerWerkzeugAnlegen(TeilnehmerWerkzeug.this));

			}
		});

		_ui.get_loeschenButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Teilnehmer teilnehmer = _ui.get_tableTeilnehmer().getSelectionModel().getSelectedItem();
				ServiceManager.teilnehmerservice().entferneTeilnehmer(teilnehmer);

			}
		});

		_ui.get_bearbeitenButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub

			}
		});

		_ui.get_searchButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (_ui.get_searchTextfield().getText().equals("")) {
					_ui.get_tableTeilnehmer()
							.setItems(ServiceManager.teilnehmerservice().getTeilnehmerObservableList());
				} else {
					List<Teilnehmer> suchliste = new ArrayList<Teilnehmer>();

					for (Teilnehmer t : ServiceManager.teilnehmerservice().getTeilnehmerList()) {
						if (t.get_nachname().get().matches(_ui.get_searchTextfield().getText())) {
							suchliste.add(t);
						}
					}

					_ui.get_tableTeilnehmer().setItems(FXCollections.observableArrayList(suchliste));

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
	 * Entfernt ein Subwerkzeug aus der Anzeige.
	 * 
	 * @param Subwerkzeug
	 */
	public void entferneSubwerkzeug(Subwerkzeug Subwerkzeug) {
		_ui.get_borderpane().setRight(null);
	}

}
