package services.teamservice;

import java.util.List;

import javafx.collections.ObservableList;
import materialien.Team;
import services.observer.ObservableService;

public interface TeamService extends ObservableService
{
   

    	/**
    	 * Entfernt ein Team aus dem Service.
    	 */
    	void entferneTeam(Team team);

    	/**
    	 * Fuegt ein neues Team in den Service ein.
    	 */
    	void fuegeTeamEin(Team team);

    	/**
    	 * Prueft, ob ein bestimmtes Team in dem Service enthalten ist.
    	 * 
    	 * @return
    	 */
    	boolean enthaeltTeam(Team team);

    	/**
    	 * Liefert eine Liste mit den vom Service gehaltenen Teams zurueck.
    	 * 
    	 * @return
    	 */
    	List<Team> getTeamList();

    	/**
    	 * Liefert ein Team anhand seiner ID zurueck.
    	 * 
    	 * @param Teamid
    	 * @return
    	 */
    	Team getTeam(int teamid);

    	/**
    	 * Teilt allen beobachtern mit, dass die Daten geändert worden sind.
    	 */
    	public void wurdeGeaendert();

    	/**
    	 * @return
    	 */
    	ObservableList<Team> getTeamObservableList();

    }

