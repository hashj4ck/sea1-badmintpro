package werkzeuge.subwerkzeuge.courtwerkzeug.bearbeitenoption;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import materialien.Court;
import services.ServiceManager;
import werkzeuge.abstraction.AbstractSubwerkzeug;
import werkzeuge.abstraction.Subwerkzeug;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.12.2016
 * @see werkzeuge.subwerkzeuge.teilnehmerwerkzeug.anlegenoption
 * @since 01.12.2016 , 10:19:43
 *
 */
public class CourtWerkzeugBearbeiten extends AbstractSubwerkzeug {

	CourtWerkzeugBearbeitenUI _ui;
	Court _court;

	/**
	 * Ueberschreiben der Methode setzeSubwerkzeug in der Klasse Subwerkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Subwerkzeug#setzeSubwerkzeug(werkzeuge.abstraction.Subwerkzeug)
	 */
	@Override
	public void setzeSubwerkzeug(Subwerkzeug Subwerkzeug) {
		// TODO Auto-generated method stub

	}

	/**
	 * Ueberschreiben der Methode registriereUIAktionen in der Klasse Werkzeug.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.Werkzeug#registriereUIAktionen()
	 */
	@Override
	public void registriereUIAktionen() {
		_ui.get_abbrechenButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				informiereUeberAenderung();
			}
		});

		_ui.get_speichernButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (_ui.get_nameTextfield().getText().equals("")) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Hinweis!");
					alert.setHeaderText("Fehlende Werte gefunden!");
					alert.setContentText(
							"Ein oder mehrere Attribute fehlen in der Eingabemaske. Bitte tragen Sie die Informationen nach und Speichern sie erneut.");

					alert.showAndWait();
				} else {

					_court.set_name(_ui.get_nameTextfield().getText());
					_court.set_beschreibung(_ui.get_beschreibungTextfield().getText());

					ServiceManager.courtservice().wurdeGeaendert();
					informiereUeberAenderung();
				}
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
	 * Ueberschreiben der Methode initialisiereLayout in der Klasse
	 * AbstractSubwerkzeug. Fuer Details zur Implementierung siehe:
	 * 
	 * @see werkzeuge.abstraction.AbstractSubwerkzeug#initialisiereLayout()
	 */
	@Override
	protected void initialisiereLayout() {
		_ui = (CourtWerkzeugBearbeitenUI) this.getFxml("fxml/CourtWerkzeugBearbeitenFxml.fxml");

	}

	/**
	 * Uebergibt die Referenz des ausgewaehlten Teilnehmers an das
	 * BearbeitenWerkzeug.
	 * 
	 * @param court
	 */
	public void setzeCourt(Court court) {
		_court = court;

		_ui.get_nameTextfield().setText(_court.get_name().get());
		_ui.get_beschreibungTextfield().setText(_court.get_beschreibung().get());
	}

}
