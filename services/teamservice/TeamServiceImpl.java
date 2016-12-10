package services.teamservice;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import materialien.Team;
import services.observer.AbstractObservableService;
import services.observer.ServiceObserver;

public class TeamServiceImpl extends AbstractObservableService implements TeamService 
{

    private List<Team> _teamliste;
    public TeamServiceImpl()
    {
	_teamliste = new ArrayList<Team>();
	informiereUeberAenderung();
    }
    

    @Override
    public void entferneTeam(Team team)
    {
	_teamliste.remove(team);
	informiereUeberAenderung();

    }

    @Override
    public void fuegeTeamEin(Team team)
    {
	_teamliste.add(team);
	informiereUeberAenderung();

    }

    @Override
    public boolean enthaeltTeam(Team team)
    {
	return _teamliste.contains(team);
    }

    @Override
    public List<Team> getTeamList()
    {
	return new ArrayList<>(_teamliste);
    }

    @Override
    public Team getTeam(int teamid)
    {
	for(Team t: _teamliste)
	{
	    if(t.get_teamID().get()== teamid)
	    {
		return t;
	    }
	}
	return null;
	
    }

    @Override
    public void wurdeGeaendert()
    {
	informiereUeberAenderung();
    }

    @Override
    public ObservableList<Team> getTeamObservableList()
    {
	return FXCollections.observableArrayList(_teamliste);
    }

}
