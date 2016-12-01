package materialien;

import javafx.beans.property.IntegerProperty;
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
public class Teilnehmer {

	private StringProperty _vorname;
	private StringProperty _nachname;
	private IntegerProperty _teilnehmerNummer;

	public Teilnehmer(String vorname, String nachname, int id) {
		_vorname = new SimpleStringProperty(vorname);
		_nachname = new SimpleStringProperty(nachname);
		_teilnehmerNummer = new SimpleIntegerProperty(id);
	}

	/**
	 * Getter-Methode zu _vorname. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _vorname abzufragen.
	 *
	 * @return the _vorname
	 */
	public StringProperty get_vorname() {
		return _vorname;
	}

	/**
	 * Setter-Methode zu _vorname. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen _vorname zu setzen.
	 *
	 * @param _vorname
	 *            the _vorname to set
	 */
	public void set_vorname(String vorname) {
		this._vorname.set(vorname);
	}

	/**
	 * Getter-Methode zu _nachname. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _nachname abzufragen.
	 *
	 * @return the _nachname
	 */
	public StringProperty get_nachname() {
		return _nachname;
	}

	/**
	 * Setter-Methode zu _nachname. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen _nachname zu setzen.
	 *
	 * @param _nachname
	 *            the _nachname to set
	 */
	public void set_nachname(String nachname) {
		this._nachname.set(nachname);
	}

	/**
	 * Getter-Methode zu _teilnehmerNummer. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen _teilnehmerNummer abzufragen.
	 *
	 * @return the _teilnehmerNummer
	 */
	public IntegerProperty get_teilnehmerNummer() {
		return _teilnehmerNummer;
	}

	/**
	 * Setter-Methode zu _teilnehmerNummer. Ermöglicht es dem Klienten, den Wert
	 * der Exemplarvariablen _teilnehmerNummer zu setzen.
	 *
	 * @param _teilnehmerNummer
	 *            the _teilnehmerNummer to set
	 */
	public void set_teilnehmerNummer(int teilnehmerNummer) {
		this._teilnehmerNummer.set(teilnehmerNummer);
	}

}
