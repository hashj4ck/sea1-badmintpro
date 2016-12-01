package werkzeuge.abstraction;

import javafx.scene.layout.Pane;

/**
 * Interface für Werkzeug-Klassen. Ein Werkzeug bietet grundlegende Funktionen
 * für die Benutzerinteraktion an.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 18.11.2016
 * @see werkzeuge
 * @since 18.11.2016 , 16:42:14
 *
 */
public interface Werkzeug {

	/**
	 * Initialisiert die Funktionen der einzelnen GUI-Elemente, damit der
	 * Benutzer mit der Anwendung interagieren kann.
	 */
	void registriereUIAktionen();

	/**
	 * Registriert die einzelnen Listener für eventuelle Subwerkzeuge und
	 * Services.
	 */
	void registriereListener();

	/**
	 * Gibt die Referenz des Container-Element von diesem Werkzeug zurueck.
	 * 
	 * @return
	 */
	public Pane getPane();

}
