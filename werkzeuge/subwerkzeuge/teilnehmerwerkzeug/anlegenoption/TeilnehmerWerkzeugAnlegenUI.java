package werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption;

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
public class TeilnehmerWerkzeugAnlegenUI extends AbstractWerkzeugUI {

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
	@FXML
	
	Pane _rootPane;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerWerkzeugAnlegenUI.
	 */
	public TeilnehmerWerkzeugAnlegenUI() {
		// TODO Auto-generated constructor stub
	}

}
