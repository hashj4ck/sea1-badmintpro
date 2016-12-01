package materialien;

import fachwerte.Status;
import javafx.beans.property.IntegerProperty;
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
	_name.set(name);
	_courtID.set(courtID);
    }
}
