package werkzeuge.abstraction;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge
 * @since 19.11.2016 , 02:10:15
 *
 */
public abstract class AbstractWerkzeugUI implements WerkzeugUI {

	@FXML
	protected Pane _rootPane;

	/**
	 * Ueberschreiben der Methode getPane in der Klasse AbstractWerkzeugUI. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.WerkzeugUI#getPane()
	 */
	@Override
	public Pane getPane() {
		return _rootPane;
	}

}
