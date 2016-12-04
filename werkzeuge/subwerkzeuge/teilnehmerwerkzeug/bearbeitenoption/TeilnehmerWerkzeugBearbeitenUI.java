package werkzeuge.subwerkzeuge.teilnehmerwerkzeug.bearbeitenoption;

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
public class TeilnehmerWerkzeugBearbeitenUI extends AbstractWerkzeugUI {

	@FXML
	CheckBox _gebuehrCheckbox;
	@FXML
	TextField _vornameTextfield;
	@FXML
	TextField _nachnameTextfield;
	@FXML
	TextField _emailTextfield;
	@FXML
	Button _speichernButton;
	@FXML
	Button _abbrechenButton;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerWerkzeugAnlegenUI.
	 */
	public TeilnehmerWerkzeugBearbeitenUI() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter-Methode zu _gebuehrCheckbox.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _gebuehrCheckbox abzufragen.
	 *
	 * @return the _gebuehrCheckbox
	 */
	public CheckBox get_gebuehrCheckbox() {
		return _gebuehrCheckbox;
	}

	/**
	 * Getter-Methode zu _vornameTextfield.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _vornameTextfield abzufragen.
	 *
	 * @return the _vornameTextfield
	 */
	public TextField get_vornameTextfield() {
		return _vornameTextfield;
	}

	/**
	 * Getter-Methode zu _nachnameTextfield.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _nachnameTextfield abzufragen.
	 *
	 * @return the _nachnameTextfield
	 */
	public TextField get_nachnameTextfield() {
		return _nachnameTextfield;
	}

	/**
	 * Getter-Methode zu _emailTextfield.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _emailTextfield abzufragen.
	 *
	 * @return the _emailTextfield
	 */
	public TextField get_emailTextfield() {
		return _emailTextfield;
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
