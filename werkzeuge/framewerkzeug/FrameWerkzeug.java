package werkzeuge.framewerkzeug;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import werkzeuge.abstraction.AbstractSubwerkzeug;
import werkzeuge.abstraction.StageWerkzeug;
import werkzeuge.abstraction.Subwerkzeug;
import werkzeuge.subwerkzeuge.dashboardwerkzeug.DashboardWerkzeug;
import werkzeuge.subwerkzeuge.teilnehmerwerkzeug.TeilnehmerWerkzeug;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge.framewerkzeug
 * @since 19.11.2016 , 15:02:29
 *
 */
public class FrameWerkzeug extends AbstractSubwerkzeug implements StageWerkzeug {

	FrameWerkzeugUI _ui;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse FrameWerkzeug.
	 * 
	 * @param fxmlpath
	 */
	public FrameWerkzeug() {

	}

	/**
	 * Ueberschreiben der Methode registriereUIAktionen in der Klasse Werkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#registriereUIAktionen()
	 */
	@Override
	public void registriereUIAktionen() {

		_ui.get_menuOptionBeenden().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				setzeSubwerkzeug(new DashboardWerkzeug());

			}
		});

		_ui.get_menuOptionTeilnehmer().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				setzeSubwerkzeug(new TeilnehmerWerkzeug());

			}
		});

	}

	/**
	 * Ueberschreiben der Methode registriereListener in der Klasse Werkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#registriereListener()
	 */
	@Override
	public void registriereListener() {
		// TODO Auto-generated method stub

	}

	/**
	 * Ueberschreiben der Methode getPane in der Klasse Werkzeug. Fuer Details
	 * zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#getPane()
	 */
	@Override
	public Pane getPane() {
		return _ui.getPane();
	}

	/**
	 * Ueberschreiben der Methode setzeSubwerkzeug in der Klasse Werkzeug. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#setzeSubwerkzeug(werkzeuge.abstraction.Werkzeug)
	 */
	@Override
	public void setzeSubwerkzeug(Subwerkzeug werkzeugObjekt) {
		BorderPane pane = (BorderPane) _ui.getPane();
		pane.setCenter(werkzeugObjekt.getPane());

	}

	/**
	 * Ueberschreiben der Methode zeigeFenster in der Klasse StageWerkzeug. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.StageWerkzeug#zeigeFenster()
	 */
	@Override
	public void zeigeFenster() {
		_ui.getFrame().show();

	}

	/**
	 * Ueberschreiben der Methode schließeFenster in der Klasse StageWerkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.StageWerkzeug#schließeFenster()
	 */
	@Override
	public void schließeFenster() {
		_ui.getFrame().close();

	}

	/**
	 * Ueberschreiben der Methode getFrame in der Klasse StageWerkzeug. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.StageWerkzeug#getFrame()
	 */
	@Override
	public Stage getFrame() {
		return _ui.getFrame();
	}

	/**
	 * Ueberschreiben der Methode initialisiereLayout in der Klasse
	 * AbstractSubwerkzeug. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.AbstractSubwerkzeug#initialisiereLayout()
	 */
	@Override
	protected void initialisiereLayout() {
		_ui = (FrameWerkzeugUI) this.getFxml("fxml/FrameWerkzeugFxml.fxml");
		_ui.setStage(new Stage());
		_ui.getFrame().setTitle("BadminPro - Turniersoftware");
		setzeSubwerkzeug(new DashboardWerkzeug());

	}

}
