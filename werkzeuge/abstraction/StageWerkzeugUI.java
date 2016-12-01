package werkzeuge.abstraction;

import javafx.stage.Stage;

/**
 * Dieses Interface repräsentiert eine UI für eine StageWerkzeug-Klasse. Sie
 * dient zum erfassen der UI-Elemente und zum Zugriff auf die Benutzeroberfläche
 * mit der der Anwender arbeitet.
 * 
 * Dieses Interface stellt eine Spezialisierung von WerkzeugUI dar. In einer
 * StageWerkzeugUI kann die Referenz auf das aktuelle Fenster abgefragt werden
 * und mehrere Fenster-Funktionen ausgeführt werden.
 * 
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 18.11.2016
 * @see werkzeuge
 * @since 18.11.2016 , 17:05:38
 *
 */
public interface StageWerkzeugUI extends WerkzeugUI {

	/**
	 * Zeigt das UI-Fenster dem Benutzer an.
	 */
	public void zeigeFenster();

	/**
	 * Schließt das UI-Fenster und macht es für den Benutzer nicht mehr
	 * verwendbar.
	 */
	public void schliesseFenster();

	/**
	 * Liefert die Referenz auf das Stageobjekt des UI-Fensters.
	 */
	public Stage getFrame();

}
