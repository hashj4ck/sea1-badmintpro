package services.observer;

/**
 * Interface für Beobachter, die sich für Änderungen eines ObservableService
 * interessieren.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 17.11.2016
 * @see services.observer
 * @since 17.11.2016 , 20:25:53
 *
 */
public interface ServiceObserver {

	/**
	 * Diese Operation wird aufgerufen, sobald sich an an dem beobachteten
	 * Service etwas relevantes geändert hat.
	 * 
	 * Implementierende Klassen müssen in dieser Operation auf die Aenderung
	 * reagieren.
	 */
	void reagiereAufAenderung();
}
