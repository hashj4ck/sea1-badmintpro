package werkzeuge.framewerkzeug;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import werkzeuge.abstraction.AbstractStageWerkzeugUI;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge.framewerkzeug
 * @since 19.11.2016 , 15:09:31
 *
 */
public class FrameWerkzeugUI extends AbstractStageWerkzeugUI {

	@FXML
	Pane _rootPane;

	@FXML
	MenuItem _menuOptionBeenden;

	@FXML
	MenuItem _menuOptionTeilnehmer;

	@FXML
	MenuItem _menuOptionCourts;

	/**
	 * Getter-Methode zu _menuOptionBeenden. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen _menuOptionBeenden abzufragen.
	 *
	 * @return the _menuOptionBeenden
	 */
	public MenuItem get_menuOptionBeenden() {
		return _menuOptionBeenden;
	}

	/**
	 * Getter-Methode zu _menuOptionTeilnehmer. Ermöglicht es einem Klienten,
	 * den Wert der Exemplarvariablen _menuOptionTeilnehmer abzufragen.
	 *
	 * @return the _menuOptionTeilnehmer
	 */
	public MenuItem get_menuOptionTeilnehmer() {
		return _menuOptionTeilnehmer;
	}

	/**
	 * Getter-Methode zu _menuOptionCourts. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen _menuOptionCourts abzufragen.
	 *
	 * @return the _menuOptionCourts
	 */
	public MenuItem get_menuOptionCourts() {
		return _menuOptionCourts;
	}

}
