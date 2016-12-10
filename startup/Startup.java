package startup;

import javafx.application.Application;
import javafx.stage.Stage;
import services.ServiceManager;
import werkzeuge.abstraction.StageWerkzeug;
import werkzeuge.framewerkzeug.FrameWerkzeug;

/**
 * Startup-Klasse für das Programm.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 17.11.2016
 * @see startup
 * @since 17.11.2016 , 20:16:07
 *
 */
public class Startup extends Application {

	@Override
	public void start(Stage primaryStage) {
		StageWerkzeug testzwei = new FrameWerkzeug();
		testzwei.zeigeFenster();

	}

	public static void main(String[] args) {

		// try {
		// Class.forName("org.h2.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:h2:~/application_db", "sa", "");
		// // add application code here
		// conn.close();
		// } catch (ClassNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		launch(args);
	}
}
