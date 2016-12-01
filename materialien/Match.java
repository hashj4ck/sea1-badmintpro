package materialien;

import fachwerte.Status;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 * Ein Match wird zwischen zwei Teams in einer Runde auf einem Court ausgetragen und 
 * kennt dabei seinen Status.
 * @author Julia-Marie
 *
 */
public class Match
{
    private Team _team1;
    private Team _team2;
    private Court _court;
    private IntegerProperty _runde;
    private StringProperty _endergebnis;
    private Status _status;
    /**
     * Erstellt ein Match mit zwei Teams auf einem Court in einer Runde. 
     * Das Match ist defaultmäßig in Vorbereitung.
     * @param team1
     * @param team2
     * @param court
     * @param runde
     * @require team!=null
     * @require team !=null
     * @require court!=null
     * @require runde>0
     */
    public Match(Team team1, Team team2, Court court, int runde)
    {
	_team1=team1;
	_team2= team2;
	_court=court;
	_runde.set(runde);
	_status= new Status(Status.IN_VORBEREITUNG);
    }
    /**
     * Gibt das erste Team zurück.
     * @return Team 1
     */
    public Team get_team1()
    {
        return _team1;
    }
    /**
     * Gibt das zweite Team zurück.
     * @return Team 2
     */
    public Team get_team2()
    {
        return _team2;
    }
    /**
     * Gibt den Court zurück.
     * @return der Court auf dem das Match ausgetragen wird
     */
    public Court get_court()
    {
        return _court;
    }
    /**
     * Gibt die Runde zurück.
     * @return
     */
    public IntegerProperty get_runde()
    {
        return _runde;
    }
    public StringProperty getEndergebnis()
    {
	return _endergebnis;
    }
    public Status getStatus()
    {
	return _status;
    }
    public void beginneMatch()
    {
	_status.setStatus(Status.LAUFEND);
    }
    public void beendeMatch(int punkteTeam1, int punkteTeam2)
    {
	_status.setStatus(Status.BEENDET);
	setEndergebnis(punkteTeam1,punkteTeam2);
    }
    private void setEndergebnis(int punkteTeam1, int punkteTeam2)
    {
	if (punkteTeam1==punkteTeam2)
	{
	    _endergebnis.set("Unentschieden zwischen " + ;
	}

    }
}
