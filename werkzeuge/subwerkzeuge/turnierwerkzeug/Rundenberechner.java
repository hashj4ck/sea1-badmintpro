package werkzeuge.subwerkzeuge.turnierwerkzeug;

import java.util.ArrayList;
import java.util.List;

import materialien.Court;
import materialien.Match;
import materialien.Team;

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
	List<Team> _teamliste;

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
	public List<Match> erstelleTurnier(List<Team> teamliste) {
		return null;
	}

	/**
	 * @require Courts passen durch Magie immer
	 * @require Teams sind immer gerade
	 * @param teamliste
	 * @param courtliste
	 */
	private void generiereMatches(List<Team> teamliste, List<Court> courtliste) {
		teamliste.sort(null);

		int anzahlTeams = teamliste.size();
		List<Match> result = new ArrayList<Match>();
		int courtindex = 0;

		while (teamliste.size() > 0) {
			Team zuVergleichendesTeam = teamliste.get(0);
			for (int i = 1; i < teamliste.size(); i++) {
				if (zuVergleichendesTeam.getGegner().contains(teamliste.get(i))) {
					// Wenn Teams schonmal zusammengespielt haben
				} else {
					// Wenn Teams nicht gegegeinander gespielt haben
					// Fuelle neue Liste mit Matches
					result.add(new Match(zuVergleichendesTeam, teamliste.get(i), courtliste.get(courtindex),
							_turnierrunde));

					// Aktualisiere Teambegegnungen
					zuVergleichendesTeam.fuegeGegnerHinzu(teamliste.get(i));
					teamliste.get(i).fuegeGegnerHinzu(zuVergleichendesTeam);

					// Entferne Teams aus der alten Teamliste
					teamliste.remove(i);
					teamliste.remove(0);
					break;
				}
			}
		}
		_turnierrunde++;
		_matchliste = result;
	}
}
