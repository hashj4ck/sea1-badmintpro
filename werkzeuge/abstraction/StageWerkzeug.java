package werkzeuge.abstraction;

import javafx.stage.Stage;

/**
 * Diese Klasse repräsentiert ein Werkzeug, das in einer eigenen Stage (Fenster)
 * läuft. In einem StageWerkzeug können mehrere Werkzeuge eingebettet werden.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 18.11.2016
 * @see werkzeuge
 * @since 18.11.2016 , 16:50:46
 *
 */
public interface StageWerkzeug extends Werkzeug {

	/**
	 * Zeigt das StageWerkzeug dem Benutzer an. Öffnet ein neues Fenster, in dem
	 * weitere Werkzeuge eingebettet werden können.
	 */
	public void zeigeFenster();

	/**
	 * Schließt das StageWerkzeug, sodass es für den Benutzer nicht mehr
	 * sichtbar ist. Wenn das StageWerkzeug geschlossen wird, werden auch alle
	 * eingebetteten Werkzeuge für den Benutzer nicht mehr benutzbar sein.
	 */
	public void schließeFenster();

	/**
	 * Liefert die Referenz auf das Stageobjekt des UI-Fensters.
	 */
	public Stage getFrame();
	
	/**
	 * Wechselt die mittlere Ansicht des StageWerkzeuges aus.
	 * 
	 * @param paneObject
	 */
	void setzeSubwerkzeug(Subwerkzeug Subwerkzeug);

}
