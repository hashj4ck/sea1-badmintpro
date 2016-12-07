package materialien;

import fachwerte.Status;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Diese Klasse repräsentiert ein Spielfeld mit einem Namen und einem Status.
 * 
 * @author Julia-Marie
 *
 */
public class Court {
	private StringProperty _name;
	private StringProperty _beschreibung;
	private Status _status;
	private IntegerProperty _courtID;

	/**
	 * Erzeugt ein neues Spielfeld mit einem Namen und einer ID. Der
	 * Defaultstatus ist "frei".
	 * 
	 * @param name
	 *            Der Name des Spielfelds
	 * @param courtID
	 *            die ID des Spielfelds
	 */
	public Court(String name, int courtID) {
		_name = new SimpleStringProperty(name);
		_beschreibung = new SimpleStringProperty("");
		_courtID = new SimpleIntegerProperty(courtID);
		_status = new Status(Status.FREI);
	}

	/**
	 * Erzeugt ein neues Spielfeld mit einem Namen und einer ID. Der
	 * Defaultstatus ist "frei".
	 * 
	 * @param name
	 *            Der Name des Spielfelds
	 * @param courtID
	 *            die ID des Spielfelds
	 */
	public Court(String name, String beschreibung, int courtID) {
		_name = new SimpleStringProperty(name);
		_beschreibung = new SimpleStringProperty(beschreibung);
		_courtID = new SimpleIntegerProperty(courtID);
		_status = new Status(Status.FREI);
	}

	/**
	 * Getter-Methode zu _name. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _name abzufragen.
	 *
	 * @return the _name
	 */
	public StringProperty get_name() {
		return _name;
	}

	/**
	 * Setter-Methode zu _name. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen _name zu setzen.
	 *
	 * @param _name
	 *            the _name to set
	 */
	public void set_name(String name) {
		assert _name != null : "Vorbedingung verletzt: _name != null!";

		this._name.set(name);
	}

	/**
	 * Getter-Methode zu _beschreibung. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen _beschreibung abzufragen.
	 *
	 * @return the _beschreibung
	 */
	public StringProperty get_beschreibung() {
		return _beschreibung;
	}

	/**
	 * Setter-Methode zu _beschreibung. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen _beschreibung zu setzen.
	 *
	 * @param beschreibung
	 *            the _beschreibung to set
	 */
	public void set_beschreibung(String beschreibung) {
		assert beschreibung != null : "Vorbedingung verletzt: _beschreibung != null!";

		this._beschreibung.set(beschreibung);
	}

	/**
	 * Getter-Methode zu _status. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _status abzufragen.
	 *
	 * @return the _status
	 */
	public Status get_status() {
		return _status;
	}

	/**
	 * Setter-Methode zu _status. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen _status zu setzen.
	 *
	 * @param status
	 *            the _status to set
	 */
	public void set_status(Status status) {
		assert status != null : "Vorbedingung verletzt: _status != null!";

		this._status = status;
	}

	/**
	 * Getter-Methode zu _courtID. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _courtID abzufragen.
	 *
	 * @return the _courtID
	 */
	public IntegerProperty get_courtID() {
		return _courtID;
	}

	/**
	 * Setter-Methode zu _courtID. Ermöglicht es dem Klienten, den Wert der
	 * Exemplarvariablen _courtID zu setzen.
	 *
	 * @param courtID
	 *            the _courtID to set
	 */
	public void set_courtID(int courtID) {

		this._courtID.set(courtID);
	}

}
