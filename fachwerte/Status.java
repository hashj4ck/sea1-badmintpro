package fachwerte;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Diese Klasse repräsentiert den Status eines Spiels.
 * 
 * @author Julia-Marie
 *
 */
public class Status {
	private StringProperty _status;
	public static final StringProperty FREI = new SimpleStringProperty("frei");
	public static final StringProperty BESETZT = new SimpleStringProperty("besetzt");
	public static final StringProperty IN_VORBEREITUNG = new SimpleStringProperty("in Vorbereitung");
	public static final StringProperty LAUFEND = new SimpleStringProperty("laufend");
	public static final StringProperty BEENDET = new SimpleStringProperty("beendet");

	/**
	 * Erzeugt einen Status.
	 * 
	 * @param status
	 *            Klassenkonstanten der Klasse Status!
	 *            (Status.FREI/LAUFEND/BESETZT/BEENDET/IN_VORBEREITUNG)
	 */
	public Status(StringProperty status) {
		_status = status;
	}

	/**
	 * Setzt einen Status.
	 * 
	 * @param status
	 *            Klassenkonstanten von Status (FREI;BESETZT;LAUFEND;BEENDET)
	 */
	public void setStatus(StringProperty status) {
		_status = status;
	}

	/**
	 * Gibt den Status eines Matches oder Courts zurück.
	 * 
	 * @return eine Stringbeschreibung des Status
	 */
	public StringProperty getStatus() {
		return _status;

	}
}
