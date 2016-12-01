package services.observer;

/**
 * Das interface für beobachtbare Services. Definiert Operationen zum An- und
 * Abmelden von Beobachtern.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 17.11.2016
 * @see services.observer
 * @since 17.11.2016 , 20:24:42
 *
 */
public interface ObservableService {

	/**
	 * Meldet den gegebenen Beoabachter beim an.
	 * 
	 * @param beobachter
	 *            Ein Beobachter, der angemeldet werden soll.
	 * 
	 * @require beobachter != null
	 */
	void registriereBeobachter(ServiceObserver beobachter);

	/**
	 * Meldet den gegebenen Beoabachter beim ab.
	 * 
	 * @param beobachter
	 *            Ein Beobachter, der abgemeldet werden soll.
	 * 
	 * @require beobachter != null
	 */
	void entferneBeobachter(ServiceObserver beobachter);
}
