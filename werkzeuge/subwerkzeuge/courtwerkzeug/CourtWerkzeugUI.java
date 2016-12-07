package werkzeuge.subwerkzeuge.courtwerkzeug;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import materialien.Court;
import werkzeuge.abstraction.AbstractWerkzeugUI;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 19.11.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.fxml
 * @since 19.11.2016 , 22:20:15
 *
 */
public class CourtWerkzeugUI extends AbstractWerkzeugUI {

	@FXML
	TableView<Court> _tableCourts;

	@FXML
	TableColumn<Court, String> _columnName;

	@FXML
	TableColumn<Court, String> _columnBeschreibung;

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
	public TableView<Court> get_tableCourts() {
		return _tableCourts;
	}

	/**
	 * Getter-Methode zu _columnName. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _columnName abzufragen.
	 *
	 * @return the _columnName
	 */
	public TableColumn<Court, String> get_columnName() {
		return _columnName;
	}

	/**
	 * Getter-Methode zu _columnBeschreibung. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen _columnBeschreibung abzufragen.
	 *
	 * @return the _columnBeschreibung
	 */
	public TableColumn<Court, String> get_columnBeschreibung() {
		return _columnBeschreibung;
	}

	/**
	 * Getter-Methode zu _bearbeitenButton. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen _bearbeitenButton abzufragen.
	 *
	 * @return the _bearbeitenButton
	 */
	public Button get_bearbeitenButton() {
		return _bearbeitenButton;
	}

	/**
	 * Getter-Methode zu _anlegenButton. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen _anlegenButton abzufragen.
	 *
	 * @return the _anlegenButton
	 */
	public Button get_anlegenButton() {
		return _anlegenButton;
	}

	/**
	 * Getter-Methode zu _loeschenButton. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen _loeschenButton abzufragen.
	 *
	 * @return the _loeschenButton
	 */
	public Button get_loeschenButton() {
		return _loeschenButton;
	}

	/**
	 * Getter-Methode zu _searchButton. Ermöglicht es einem Klienten, den Wert
	 * der Exemplarvariablen _searchButton abzufragen.
	 *
	 * @return the _searchButton
	 */
	public Button get_searchButton() {
		return _searchButton;
	}

	/**
	 * Getter-Methode zu _searchTextfield. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen _searchTextfield abzufragen.
	 *
	 * @return the _searchTextfield
	 */
	public TextField get_searchTextfield() {
		return _searchTextfield;
	}

	/**
	 * Getter-Methode zu _borderpane. Ermöglicht es einem Klienten, den Wert der
	 * Exemplarvariablen _borderpane abzufragen.
	 *
	 * @return the _borderpane
	 */
	public BorderPane get_borderpane() {
		return _borderpane;
	}

}
