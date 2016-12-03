package werkzeuge.subwerkzeuge.teilnehmerwerkzeug;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
	
	@FXML
	TableColumn<Teilnehmer, String> _columnEmail;
	
	@FXML
	TableColumn<Teilnehmer, Boolean> _columnBezahlt;
	
	@FXML
	Button _bearbeitenButton;
	
	@FXML
	Button _anlegenButton;
	
	@FXML
	Button _loeschenButton;
	
	@FXML
	Button _searchButton;
	
	@FXML
	TextField _searchTextfield;
	
	@FXML
	BorderPane _borderpane;

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

	/**
	 * Getter-Methode zu _bearbeitenButton.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _bearbeitenButton abzufragen.
	 *
	 * @return the _bearbeitenButton
	 */
	public Button get_bearbeitenButton() {
		return _bearbeitenButton;
	}

	/**
	 * Getter-Methode zu _anlegenButton.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _anlegenButton abzufragen.
	 *
	 * @return the _anlegenButton
	 */
	public Button get_anlegenButton() {
		return _anlegenButton;
	}

	/**
	 * Getter-Methode zu _loeschenButton.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _loeschenButton abzufragen.
	 *
	 * @return the _loeschenButton
	 */
	public Button get_loeschenButton() {
		return _loeschenButton;
	}

	/**
	 * Getter-Methode zu _searchTextfield.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _searchTextfield abzufragen.
	 *
	 * @return the _searchTextfield
	 */
	public TextField get_searchTextfield() {
		return _searchTextfield;
	}

	/**
	 * Getter-Methode zu _borderpane.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _borderpane abzufragen.
	 *
	 * @return the _borderpane
	 */
	public BorderPane get_borderpane() {
		return _borderpane;
	}

	/**
	 * Getter-Methode zu _searchButton.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _searchButton abzufragen.
	 *
	 * @return the _searchButton
	 */
	public Button get_searchButton() {
		return _searchButton;
	}

	/**
	 * Getter-Methode zu _columnEmail.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _columnEmail abzufragen.
	 *
	 * @return the _columnEmail
	 */
	public TableColumn<Teilnehmer, String> get_columnEmail() {
		return _columnEmail;
	}

	/**
	 * Getter-Methode zu _columnBezahlt.
	 * Ermöglicht es einem Klienten, den Wert der Exemplarvariablen _columnBezahlt abzufragen.
	 *
	 * @return the _columnBezahlt
	 */
	public TableColumn<Teilnehmer, Boolean> get_columnBezahlt() {
		return _columnBezahlt;
	}

}
