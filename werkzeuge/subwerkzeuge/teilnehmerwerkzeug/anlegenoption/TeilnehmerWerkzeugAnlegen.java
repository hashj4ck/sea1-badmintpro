package werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption;

import javafx.scene.layout.Pane;
import werkzeuge.abstraction.AbstractSubwerkzeug;
import werkzeuge.abstraction.Subwerkzeug;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.12.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption
 * @since 01.12.2016 , 10:19:43
 *
 */
public class TeilnehmerWerkzeugAnlegen extends AbstractSubwerkzeug {

	TeilnehmerWerkzeugAnlegenUI _ui;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerWerkzeugAnlegen.
	 */
	public TeilnehmerWerkzeugAnlegen() {
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub

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
