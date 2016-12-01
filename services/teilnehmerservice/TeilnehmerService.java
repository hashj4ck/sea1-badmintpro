package services.teilnehmerservice;

import java.util.List;

import javafx.collections.ObservableList;
import materialien.Teilnehmer;
import services.observer.ObservableService;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 20.11.2016
 * @see services.teilnehmerservice
 * @since 20.11.2016 , 00:00:14
 *
 */
public interface TeilnehmerService extends ObservableService {

	/**
	 * Entfernt einen Teilnehmer aus dem Service.
	 */
	void entferneTeilnehmer(Teilnehmer teilnehmer);

	/**
	 * Fuegt einen neuen Teilnehmer in den Service ein.
	 */
	void fuegeTeilnehmerEin(Teilnehmer teilnehmer);

	/**
	 * Prueft, ob ein bestimmter Teilnehmer in dem Service enthalten ist.
	 * 
	 * @return
	 */
	boolean enthaeltTeilnehmer(Teilnehmer teilnehmer);

	/**
	 * Liefert eine Liste mit den vom Service gehaltenen Teilnehmern zurueck.
	 * 
	 * @return
	 */
	List<Teilnehmer> getTeilnehmerList();

	/**
	 * Liefert einen Teilnehmer anhand seiner ID zurueck.
	 * 
	 * @param teilnehmerId
	 * @return
	 */
	Teilnehmer getTeilnehmer(int teilnehmerId);

	/**
	 * Teilt allen beobachtern mit, dass die Daten geändert worden sind.
	 */
	public void wurdeGeaendert();

	/**
	 * @return
	 */
	ObservableList<Teilnehmer> getTeilnehmerObservableList();

}
