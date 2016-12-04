package werkzeuge.abstraction;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import werkzeuge.observer.ObservableSubwerkzeug;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge
 * @since 19.11.2016 , 01:44:04
 *
 */
public abstract class AbstractSubwerkzeug extends ObservableSubwerkzeug implements Subwerkzeug {

	/**
	 * Konstruktor fuer neue Exemplare der Klasse AbstractWerkzeug.
	 * 
	 * @param fxmlpath
	 */
	public AbstractSubwerkzeug() {

		initialisiereLayout();
		registriereListener();
		registriereUIAktionen();

	}

	/**
	 * Initialisiert die einzelnen Komponenten für die UI
	 * 
	 * @param fxmlpath
	 */
	protected abstract void initialisiereLayout();

	/**
	 * Initialisiert die UI-Klasse durch laden einer FXML Datei. Der Pfad zur
	 * Fxml-Datei muss relativ zum Pfad der ladenden Werkzeugklasse gesetzt
	 * werden.<br>
	 * 
	 * <br>
	 * <b>Beispiel:</b> Ruft diese Klasse die Methode auf und die FXML-Datei
	 * befindet sich in einem Unterverzeichnis "Unterpaket" von diesem Package,
	 * so ist der Pfad "Unterpaket/FxmlDatei.fxml". Liegt die Fxml Datei im
	 * selben Verzeichnis wie die ladende Klasse, reicht die Angabe des
	 * Dateinamens "FxmlDatei.fxml".<br>
	 * 
	 * <br>
	 * <b>Wichtig</b>: In der Fxml-Datei muss als Controller die UI-Klasse für
	 * das Werkzeug hinterlegt sein!
	 * 
	 * @param fxmlpath
	 */
	protected WerkzeugUI getFxml(String fxmlpath) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource(fxmlpath));
			loader.load();
			WerkzeugUI ui = loader.getController();

			return ui;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
