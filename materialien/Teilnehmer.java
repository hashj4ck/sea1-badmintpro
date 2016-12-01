package materialien;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Diese Klasse repräsentiert einen Turnierteilnehmer mit samt seinen
 * Attributen.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 17.11.2016
 * @see materialien
 * @since 17.11.2016 , 23:32:17
 *
 */
public class Teilnehmer
{

    private StringProperty _vorname;
    private StringProperty _nachname;
    private IntegerProperty _teilnehmerNummer;
    private BooleanProperty _bezahlt;
    private StringProperty _email;
    /**
     * Erzeugt einen neuen Teilnehmer mit Vor-und Nachnamen, Emailadresse und id.
     * @param vorname Der Vorname des Teilnehmers
     * @param nachname Der Nachname des Teilnehmers
     * @param id Die Teilnehmernummer 
     * @param email die Emailadresse des Teilnehmers
     * 
     */
    public Teilnehmer(String vorname, String nachname, String email, int id)
    {
	_vorname = new SimpleStringProperty(vorname);
	_nachname = new SimpleStringProperty(nachname);
	_teilnehmerNummer = new SimpleIntegerProperty(id);
	_bezahlt = new SimpleBooleanProperty(false);
	_email= new SimpleStringProperty(email);
    }
    public StringProperty getEmail()
    {
	return _email;
    }
    public void setEmail(String email)
    {
	_email.set(email);
    }
    /**
     * Getter-Methode zu _vorname. Ermöglicht es einem Klienten, den Wert der
     * Exemplarvariablen _vorname abzufragen.
     *
     * @return the _vorname
     */
    public StringProperty get_vorname()
    {
	return _vorname;
    }
    /**
     * Gibt den Bezahlstatus des Teilnehmers zurück.
     * @return true, wenn Geld schon eingegangen ist, false wenn nicht
     */
    public BooleanProperty hatBezahlt()
    {
	return _bezahlt;
    }
    /**
     * Setzt den Bezahlstatus auf true.
     */
    public void bezahlen()
    {
	_bezahlt.set(true);
    }

    /**
     * Setter-Methode zu _vorname. Ermöglicht es dem Klienten, den Wert der
     * Exemplarvariablen _vorname zu setzen.
     *
     * @param _vorname
     *            the _vorname to set
     */
    public void set_vorname(String vorname)
    {
	this._vorname.set(vorname);
    }

    /**
     * Getter-Methode zu _nachname. Ermöglicht es einem Klienten, den Wert der
     * Exemplarvariablen _nachname abzufragen.
     *
     * @return the _nachname
     */
    public StringProperty get_nachname()
    {
	return _nachname;
    }

    /**
     * Setter-Methode zu _nachname. Ermöglicht es dem Klienten, den Wert der
     * Exemplarvariablen _nachname zu setzen.
     *
     * @param _nachname
     *            the _nachname to set
     */
    public void set_nachname(String nachname)
    {
	this._nachname.set(nachname);
    }

    /**
     * Getter-Methode zu _teilnehmerNummer. Ermöglicht es einem Klienten, den
     * Wert der Exemplarvariablen _teilnehmerNummer abzufragen.
     *
     * @return the _teilnehmerNummer
     */
    public IntegerProperty get_teilnehmerNummer()
    {
	return _teilnehmerNummer;
    }

    /**
     * Setter-Methode zu _teilnehmerNummer. Ermöglicht es dem Klienten, den Wert
     * der Exemplarvariablen _teilnehmerNummer zu setzen.
     *
     * @param _teilnehmerNummer
     *            the _teilnehmerNummer to set
     */
    public void set_teilnehmerNummer(int teilnehmerNummer)
    {
	this._teilnehmerNummer.set(teilnehmerNummer);
    }

}
