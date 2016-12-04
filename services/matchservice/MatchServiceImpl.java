package services.matchservice;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import materialien.Match;
import materialien.Teilnehmer;
import services.observer.AbstractObservableService;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.12.2016
 * @see services.matchservice
 * @since 03.12.2016 , 23:39:42
 *
 */
public class MatchServiceImpl extends AbstractObservableService implements MatchService {

	private List<Match> _matchliste;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse MatchServiceImpl.
	 */
	public MatchServiceImpl() {
		_matchliste = new ArrayList<Match>();
		informiereUeberAenderung();
	}

	/**
	 * Ueberschreiben der Methode entferneMatch in der Klasse MatchService. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see services.matchservice.MatchService#entferneMatch(materialien.Match)
	 */
	@Override
	public void entferneMatch(Match match) {
		_matchliste.remove(match);
		informiereUeberAenderung();
	}

	/**
	 * Ueberschreiben der Methode fuegeMatchEin in der Klasse MatchService. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see services.matchservice.MatchService#fuegeMatchEin(materialien.Match)
	 */
	@Override
	public void fuegeMatchEin(Match match) {
		_matchliste.add(match);
		informiereUeberAenderung();
	}

	/**
	 * Ueberschreiben der Methode enthaeltMatch in der Klasse MatchService. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see services.matchservice.MatchService#enthaeltMatch(materialien.Match)
	 */
	@Override
	public boolean enthaeltMatch(Match match) {
		return _matchliste.contains(match);
	}

	/**
	 * Ueberschreiben der Methode getMatchList in der Klasse MatchService. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see services.matchservice.MatchService#getMatchList()
	 */
	@Override
	public List<Match> getMatchList() {
		return new ArrayList<Match>(_matchliste);
	}

	/**
	 * Ueberschreiben der Methode getMatch in der Klasse MatchService. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see services.matchservice.MatchService#getMatch(int)
	 */
	@Override
	public Teilnehmer getMatch(int matchid) {
		// Match ID fehlt
		return null;
	}

	/**
	 * Ueberschreiben der Methode wurdeGeaendert in der Klasse MatchService.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.matchservice.MatchService#wurdeGeaendert()
	 */
	@Override
	public void wurdeGeaendert() {
		informiereUeberAenderung();

	}

	/**
	 * Ueberschreiben der Methode getMatchObservableList in der Klasse
	 * MatchService. Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.matchservice.MatchService#getMatchObservableList()
	 */
	@Override
	public ObservableList<Match> getMatchObservableList() {
		return FXCollections.observableArrayList(_matchliste);
	}

}
