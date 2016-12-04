package services.matchservice;

import java.util.List;

import javafx.collections.ObservableList;
import materialien.Match;
import materialien.Teilnehmer;
import services.observer.ObservableService;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 20.11.2016
 * @see services.teilnehmerservice
 * @since 20.11.2016 , 00:00:14
 *
 */
public interface MatchService extends ObservableService {

	/**
	 * Entfernt ein Match aus dem Service.
	 */
	void entferneMatch(Match match);

	/**
	 * Fuegt ein neues Match in den Service ein.
	 */
	void fuegeMatchEin(Match match);

	/**
	 * Prueft, ob ein bestimmtes Match in dem Service enthalten ist.
	 * 
	 * @return
	 */
	boolean enthaeltMatch(Match match);

	/**
	 * Liefert eine Liste mit den vom Service gehaltenen Matches zurueck.
	 * 
	 * @return
	 */
	List<Match> getMatchList();

	/**
	 * Liefert ein Match anhand seiner ID zurueck.
	 * 
	 * @param matchid
	 * @return
	 */
	Teilnehmer getMatch(int matchid);

	/**
	 * Teilt allen beobachtern mit, dass die Daten geändert worden sind.
	 */
	public void wurdeGeaendert();

	/**
	 * @return
	 */
	ObservableList<Match> getMatchObservableList();

}
