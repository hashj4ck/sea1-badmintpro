package werkzeuge.abstraction;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge
 * @since 19.11.2016 , 02:12:07
 *
 */
public abstract class AbstractStageWerkzeugUI extends AbstractWerkzeugUI implements StageWerkzeugUI {

	Stage _frame;

	/**
	 * Ueberschreiben der Methode zeigeFenster in der Klasse
	 * AbstractStageWerkzeugUI. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.StageWerkzeugUI#zeigeFenster()
	 */
	@Override
	public void zeigeFenster() {
		_frame.show();

	}

	/**
	 * Ueberschreiben der Methode schliesseFenster in der Klasse
	 * AbstractStageWerkzeugUI. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.StageWerkzeugUI#schliesseFenster()
	 */
	@Override
	public void schliesseFenster() {
		_frame.close();
	}

	/**
	 * Ueberschreiben der Methode getFrame in der Klasse
	 * AbstractStageWerkzeugUI. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.StageWerkzeugUI#getFrame()
	 */
	@Override
	public Stage getFrame() {
		return _frame;

	}

	public void setStage(Stage primaryStage) {
		_frame = primaryStage;
		Scene scene = new Scene(_rootPane);
		_frame.setScene(scene);
	}

}
