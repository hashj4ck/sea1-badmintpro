package werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import materialien.Teilnehmer;
import services.ServiceManager;
import werkzeuge.abstraction.AbstractSubwerkzeug;
import werkzeuge.abstraction.Subwerkzeug;
import werkzeuge.subwerkzeuge.teilnehmerwerkzeug.TeilnehmerWerkzeug;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.12.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption
 * @since 01.12.2016 , 10:19:43
 *
 */
public class TeilnehmerWerkzeugAnlegen extends AbstractSubwerkzeug {

	TeilnehmerWerkzeugAnlegenUI _ui;
	TeilnehmerWerkzeug _teilnehmerWerkzeug;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerWerkzeugAnlegen.
	 */
	public TeilnehmerWerkzeugAnlegen(TeilnehmerWerkzeug teilnehmerwerkzeug) {
		_teilnehmerWerkzeug = teilnehmerwerkzeug;
	}

	/**
	 * Ueberschreiben der Methode setzeSubwerkzeug in der Klasse Subwerkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Subwerkzeug#setzeSubwerkzeug(werkzeuge.abstraction.Subwerkzeug)
	 */
	@Override
	public void setzeSubwerkzeug(Subwerkzeug Subwerkzeug) {
		// TODO Auto-generated method stub

	}

	/**
	 * Ueberschreiben der Methode registriereUIAktionen in der Klasse Werkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#registriereUIAktionen()
	 */
	@Override
	public void registriereUIAktionen() {
		_ui.get_abbrechenButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				_teilnehmerWerkzeug.entferneSubwerkzeug(_teilnehmerWerkzeug);
			}
		});

		_ui.get_speichernButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Teilnehmer teilnehmer = new Teilnehmer(_ui.get_vornameTextfield().getText(),
						_ui.get_nachnameTextfield().getText(), _ui.get_emailTextfield().getText(), 1);
				ServiceManager.teilnehmerservice().fuegeTeilnehmerEin(teilnehmer);
				_teilnehmerWerkzeug.entferneSubwerkzeug(_teilnehmerWerkzeug);

			}
		});

	}

	/**
	 * Ueberschreiben der Methode registriereListener in der Klasse Werkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#registriereListener()
	 */
	@Override
	public void registriereListener() {
		// TODO Auto-generated method stub

	}

	/**
	 * Ueberschreiben der Methode getPane in der Klasse Werkzeug. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#getPane()
	 */
	@Override
	public Pane getPane() {
		return _ui.getPane();
	}

	/**
	 * Ueberschreiben der Methode initialisiereLayout in der Klasse
	 * AbstractSubwerkzeug. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.AbstractSubwerkzeug#initialisiereLayout()
	 */
	@Override
	protected void initialisiereLayout() {
		_ui = (TeilnehmerWerkzeugAnlegenUI) this.getFxml("fxml/TeilnehmerWerkzeugAnlegenFxml.fxml");

	}

}
