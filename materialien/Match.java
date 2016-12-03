package materialien;

import fachwerte.Status;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;

/**
 * Ein Match wird zwischen zwei Teams in einer Runde auf einem Court ausgetragen
 * und kennt dabei seinen Status.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @author Julia-Marie Stache <julia-marie.stache@haw-hamburg.de>
 * @version 03.12.2016
 * @see materialien
 * @since 03.12.2016 , 21:47:31
 *
 */
public class Match {
	private Team _team1;
	private Team _team2;
	private Court _court;
	private IntegerProperty _runde;
	private StringProperty _endergebnis;
	private Status _status;

	/**
	 * Erstellt ein Match mit zwei Teams auf einem Court in einer Runde. Das
	 * Match ist defaultmäßig in Vorbereitung.
	 * 
	 * @param team1
	 * @param team2
	 * @param court
	 * @param runde
	 * @require team1!=null
	 * @require team2 !=null
	 * @require court!=null
	 * @require runde>0
	 */
	public Match(Team team1, Team team2, Court court, int runde) {
		assert court != null : "Vorbedingung verletzt: court != null";
		assert team1 != null : "Vorbedingung verletzt: team1 != null";
		assert team2 != null : "Vorbedingung verletzt: team2 != null";
		assert runde > 0 : "Vorbedingung verletzt: runde>0";
		_team1 = team1;
		_team2 = team2;
		_court = court;
		_runde = new SimpleIntegerProperty(runde);
		_status = new Status(Status.IN_VORBEREITUNG);
	}

	/**
	 * Gibt das erste Team zurück.
	 * 
	 * @return Team 1
	 */
	public Team get_team1() {
		return _team1;
	}

	/**
	 * Gibt das zweite Team zurück.
	 * 
	 * @return Team 2
	 */
	public Team get_team2() {
		return _team2;
	}

	/**
	 * Gibt den Court zurück.
	 * 
	 * @return der Court auf dem das Match ausgetragen wird
	 */
	public Court get_court() {
		return _court;
	}

	/**
	 * Gibt die Runde zurück.
	 * 
	 * @return
	 */
	public IntegerProperty get_runde() {
		return _runde;
	}

	/**
	 * Gibt das Endergebnis als String zurück.
	 * 
	 * @return
	 */
	public StringProperty getEndergebnis() {
		return _endergebnis;
	}

	/**
	 * Gibt den Status des Matches zurück.
	 * 
	 * @return Ein Status-Objekt, dass den Zustand in Vorbereitung, laufend oder
	 *         beendet haben kann.
	 * 
	 */
	public Status getStatus() {
		return _status;
	}

	/**
	 * Setzt den Status des Matches auf laufend.
	 */
	public void beginneMatch() {
		_status.setStatus(Status.LAUFEND);
	}

	/**
	 * Setzt den Status des Matches auf beendet und
	 * 
	 * @param punkteTeam1
	 *            die von Team 1 erzielten Punkte
	 * @param punkteTeam2
	 *            die von Team 2 erzielten Punkte
	 * @require punkteTeam1>=0
	 * @require punkteTeam2>=0
	 */
	public void beendeMatch(int punkteTeam1, int punkteTeam2) {
		assert punkteTeam1 >= 0 : "Vorbedingung verletzt: punkteTeam1>=0";
		assert punkteTeam2 >= 0 : "Vorbedingung verletzt: punkteTeam2>=0";
		_status.setStatus(Status.BEENDET);
		setEndergebnis(punkteTeam1, punkteTeam2);
	}

	/**
	 * Private Hilfsmethode, die die Gesamtpunktzahl der Teams erhöht und die
	 * Anzahl der Siege des besseren Teams erhöht. Setzt das Endergebnis auf
	 * einen beschreibenden String.
	 * 
	 * @param punkteTeam1
	 *            die von Team 1 erzielten Punkte
	 * @param punkteTeam2
	 *            die von Team 2 erzielten Punkte
	 */
	private void setEndergebnis(int punkteTeam1, int punkteTeam2) {
		if (punkteTeam1 == punkteTeam2) {
			_endergebnis.set("Unentschieden zwischen " + _team1 + " und " + _team2);

		}
		if (punkteTeam1 < punkteTeam2) {
			_team2.erhoeheanzahlSiege();
			_endergebnis.set("" + _team2 + " hat mit " + punkteTeam2 + " zu  " + punkteTeam1 + " gegen " + _team1
					+ " gewonnen.");

		}
		if (punkteTeam1 > punkteTeam2) {
			_team1.erhoeheanzahlSiege();
			_endergebnis.set("" + _team1 + " hat mit " + punkteTeam1 + " zu  " + punkteTeam2 + " gegen " + _team2
					+ " gewonnen.");
		}
		_team1.erhoeheGesamtPunktzahl(punkteTeam1);
		_team2.erhoeheGesamtPunktzahl(punkteTeam2);

	}
}
