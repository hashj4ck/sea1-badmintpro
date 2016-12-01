package werkzeuge.abstraction;

import javafx.scene.layout.Pane;

/**
 * Dieses Interface repräsentiert eine UI für eine Werkzeug-Klasse. Sie dient
 * zum erfassen der UI-Elemente und zum Zugriff auf die Benutzeroberfläche mit
 * der der Anwender arbeitet.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 18.11.2016
 * @see werkzeuge
 * @since 18.11.2016 , 17:01:21
 *
 */
public interface WerkzeugUI {

	/**
	 * Liefert die Referenz auf das Container-Element der UI.
	 * 
	 * @return
	 */
	public Pane getPane();

}
