package werkzeuge.subwerkzeuge.teilnehmerwerkzeug;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import materialien.Teilnehmer;
import werkzeuge.abstraction.AbstractWerkzeugUI;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.fxml
 * @since 19.11.2016 , 22:20:15
 *
 */
public class TeilnehmerWerkzeugUI extends AbstractWerkzeugUI {

	@FXML
	TableView<Teilnehmer> _tableTeilnehmer;

	@FXML
	TableColumn<Teilnehmer, String> _columnVorname;

	@FXML
	TableColumn<Teilnehmer, String> _columnNachname;

	/**
	 * Getter-Methode zu _tableTeilnehmer. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen _tableTeilnehmer abzufragen.
	 *
	 * @return the _tableTeilnehmer
	 */
	public TableView<Teilnehmer> get_tableTeilnehmer() {
		return _tableTeilnehmer;
	}

	/**
	 * Getter-Methode zu _columnVorname. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen _columnVorname abzufragen.
	 *
	 * @return the _columnVorname
	 */
	public TableColumn<Teilnehmer, String> get_columnVorname() {
		return _columnVorname;
	}

	/**
	 * Getter-Methode zu _columnNachname. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen _columnNachname abzufragen.
	 *
	 * @return the _columnNachname
	 */
	public TableColumn<Teilnehmer, String> get_columnNachname() {
		return _columnNachname;
	}

}
