package materialien;

import fachwerte.Status;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Diese Klasse repräsentiert ein Spielfeld mit einem Namen und einem Status.
 * @author Julia-Marie
 *
 */
public class Court
{
    private StringProperty _name;
    private Status _status;
    private IntegerProperty _courtID;
    
    /**
     * Erzeugt ein neues Spielfeld mit einem Namen und einer ID. 
     * Der Defaultstatus ist "frei".
     * @param name Der Name des Spielfelds
     * @param courtID die ID des Spielfelds
     */
    public Court(String name, int courtID)
    {
	_name= new SimpleStringProperty(name);
	_courtID= new SimpleIntegerProperty(courtID);
	_status= new Status(Status.FREI);
    }
    /**
     * Gibt den Courtnamen zurück
     * @return der Courtname
     */
    public StringProperty getName()
    {
	return _name;
    }
    /** 
     * Setzt einen neuen Namen für das Spielfeld
     * @param name Der neue Courtname
     */
    public void setName(String name)
    {
	_name.set(name);
    }
    /**
     * Gibt die ID des Spielfelds zurück.
     * @return die CourtID
     */
    public IntegerProperty getCourtID()
    {
	return _courtID;
    }
    
}
