package services.courtservice;

import java.util.List;

import javafx.collections.ObservableList;
import materialien.Court;
import services.observer.ObservableService;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 20.11.2016
 * @see services.teilnehmerservice
 * @since 20.11.2016 , 00:00:14
 *
 */
public interface CourtService extends ObservableService {

	/**
	 * Entfernt einen Court aus dem Service.
	 */
	void entferneCourt(Court court);

	/**
	 * Fuegt einen neuen Court in den Service ein.
	 */
	void fuegeCourtEin(Court court);

	/**
	 * Prueft, ob ein bestimmter Court in dem Service enthalten ist.
	 * 
	 * @return
	 */
	boolean enthaeltCourt(Court court);

	/**
	 * Liefert eine Liste mit den vom Service gehaltenen Courts zurueck.
	 * 
	 * @return
	 */
	List<Court> getCourtList();

	/**
	 * Liefert einen Court anhand seiner ID zurueck.
	 * 
	 * @param teilnehmerId
	 * @return
	 */
	Court getCourt(int courtId);

	/**
	 * Teilt allen beobachtern mit, dass die Daten geändert worden sind.
	 */
	public void wurdeGeaendert();

	/**
	 * @return
	 */
	ObservableList<Court> getCourtObservableList();

}
