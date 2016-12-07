package werkzeuge.subwerkzeuge.courtwerkzeug.bearbeitenoption;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import werkzeuge.abstraction.AbstractWerkzeugUI;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.12.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption
 * @since 01.12.2016 , 10:19:59
 *
 */
public class CourtWerkzeugBearbeitenUI extends AbstractWerkzeugUI {

	@FXML
	TextField _nameTextfield;
	@FXML
	TextField _beschreibungTextfield;
	@FXML
	Button _speichernButton;
	@FXML
	Button _abbrechenButton;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerWerkzeugAnlegenUI.
	 */
	public CourtWerkzeugBearbeitenUI() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter-Methode zu _nameTextfield.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _nameTextfield abzufragen.
	 *
	 * @return the _nameTextfield
	 */
	public TextField get_nameTextfield() {
		return _nameTextfield;
	}

	/**
	 * Getter-Methode zu _beschreibungTextfield.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _beschreibungTextfield abzufragen.
	 *
	 * @return the _beschreibungTextfield
	 */
	public TextField get_beschreibungTextfield() {
		return _beschreibungTextfield;
	}

	/**
	 * Getter-Methode zu _speichernButton.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _speichernButton abzufragen.
	 *
	 * @return the _speichernButton
	 */
	public Button get_speichernButton() {
		return _speichernButton;
	}

	/**
	 * Getter-Methode zu _abbrechenButton.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _abbrechenButton abzufragen.
	 *
	 * @return the _abbrechenButton
	 */
	public Button get_abbrechenButton() {
		return _abbrechenButton;
	}



}
