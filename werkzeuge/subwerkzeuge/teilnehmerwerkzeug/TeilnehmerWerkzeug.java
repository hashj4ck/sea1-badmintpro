package werkzeuge.subwerkzeuge.teilnehmerwerkzeug;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
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
				setzeSubwerkzeug(new TeilnehmerWerkzeugAnlegen());

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

	}

	/**
	 * Ueberschreiben der Methode setzeSubwerkzeug in der Klasse Subwerkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Subwerkzeug#setzeSubwerkzeug(werkzeuge.abstraction.Subwerkzeug)
	 */
	@Override
	public void setzeSubwerkzeug(Subwerkzeug Subwerkzeug) {
		BorderPane pane = (BorderPane) _ui.getPane();
		pane.setRight(pane);
	}

}
