package materialien;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Ein Team besteht aus zwei Teilnehmern, im Ausnahmefall auch aus einem. Ein
 * Team kennt seine Gesamtpunktzahl und die Anzahl seine Siege.
 * 
 * @author Julia-Marie
 *
 */
public class Team implements Comparable<Team>
{

    private List<Teilnehmer> _mitglieder;
    private StringProperty _teamName;
    private IntegerProperty _teamID;
    private IntegerProperty _gesamtPunktzahl;
    private IntegerProperty _anzahlSiege;
    private Set<Team> _gegner;

    /**
     * Ein Team bestimmt aus mindestens einem Teilnehmer und hat einen Namen.
     * @require mitglieder.size()>0
     */
    public Team(List<Teilnehmer> mitglieder, String teamname)
    {
	assert mitglieder.size()>0: "Vorbedingung verletzt: mitglieder.size()>0";
	_mitglieder=mitglieder;
	_teamName=new SimpleStringProperty(teamname);
	_gesamtPunktzahl.set(0);
	_anzahlSiege.set(0);
	_gegner = new HashSet<>();
    }
    /**
     * Gibt die Gesamtzahl aller bis jetzt erreichten Punkte aus.
     * @return die Gesamtpunktzahl aller vom Team gespielten Spiele
     */
    public IntegerProperty get_gesamtPunktzahl()
    {
        return _gesamtPunktzahl;
    }
    /**
     * Erhöht die Gesamtpunktzahl um die im letzten Spiel erreichte Zahl.
     * @param punkte Die Punktzahl im zuletzt gespielten Spiel
     * @require punkte >0
     */
    public void erhoeheGesamtPunktzahl(int punkte)
    {
       assert punkte>0 : "Vorbedingung verletzt: punkte>0";
	_gesamtPunktzahl.set(_gesamtPunktzahl.get() + punkte);
    }

    /**
     * Gibt die Anzahl aller Siege des Teams zurück.
     * @return die Anzahl aller Siege 
     */
    public IntegerProperty get_anzahlSiege()
    {
        return _anzahlSiege;
    }
    /**
     * Erhöht nach einem gewonnenen Spiel die Anzahl der Siege um 1.
     */
    public void erhoeheanzahlSiege()
    {
        _anzahlSiege.set(_anzahlSiege.get()+1);
    }

    /**
     * Gibt eine Liste der Teilnehmer zurück.
     * @return Eine Liste aller Teilnehmer
     */
    public List<Teilnehmer> getMitglieder()
    {
        return _mitglieder;
    }
    /**
     * Gibt den Teamnamen zurück.
     * @return der Teamname
     */
    public StringProperty getTeamName()
    {
        return _teamName;
    }
    /**
     * Gibt die TeamID zurück.
     * @return die TeamID
     */
    public IntegerProperty get_teamID()
    {
        return _teamID;
    }
    @Override
    /**
     * @return 0, wenn die Teams die gleiche Punktzahl und die gleiche Anzahl Siege haben.
     * @return -1, wenn das zu vergleichende Team mehr Punkte und/oder mehr Siege hat
     * @return 1, wenn das zu vergleichende Team weniger Punkte und/oder weniger Siege hat.
     */
    public int compareTo(Team team2)
    {
	int result=0;
	if(this._gesamtPunktzahl== team2.get_gesamtPunktzahl() && this._anzahlSiege== team2.get_anzahlSiege())
	{
	    result= 0;
	}
	if(this._gesamtPunktzahl.get()>team2.get_gesamtPunktzahl().get())
	{
	    result= 1;
	}
	if(this._gesamtPunktzahl.get()==team2._gesamtPunktzahl.get())
	{
	    if(this.get_anzahlSiege().get()>team2.get_anzahlSiege().get())
	    {
		result= 1;
	    }
	    else
	    {
		result= -1;
	    }
	}
	return result;
    }
    public void fuegeGegnerHinzu(Team team)
    {
	_gegner.add(team);
    }
    public Set<Team> getGegner()
    {
	return _gegner;
    }
    
    
    
    
}
