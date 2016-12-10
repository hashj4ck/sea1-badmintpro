package werkzeuge.subwerkzeuge.turnierwerkzeug;

import java.util.List;

import fachwerte.Status;
import materialien.Court;
import materialien.Match;
import materialien.Team;
import materialien.Teilnehmer;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 10.12.2016
 * @see werkzeuge.subwerkzeuge.turnierwerkzeug
 * @since 10.12.2016 , 15:31:05
 *
 */
public class Rundenberechner {

	int _turnierrunde;
	List<Match> _matchliste;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse Rundenberechner.
	 */
	public Rundenberechner() {

	}

	/**
	 * Erstellt eine Liste mit Teamszusammensetzungen mithilfe der uebergender
	 * Teilnehmer
	 * 
	 * @param teilnehmerliste
	 * @return
	 */
	public List<Match> erstelleTurnier(List<Team> teamliste, List<Court> courtliste) {
		return null;
	}

	/**
	 * Beendet eine Turnierrunde und startet die naechste
	 * 
	 * @return
	 */
	public List<Match> erhoeheRunde() {
		// Wenn nicht alle Matches beendet sind, abbrechen
		for (Match m : _matchliste) {
			if (!(m.getStatus().equals(Status.BEENDET))) {
				return null;
			}
		}

		for (Match m : _matchliste) {

		}

	}
}
