package werkzeuge.subwerkzeuge.teilnehmerwerkzeug.bearbeitenoption;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import materialien.Teilnehmer;
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
public class TeilnehmerWerkzeugBearbeiten extends AbstractSubwerkzeug {

	TeilnehmerWerkzeugBearbeitenUI _ui;
	Teilnehmer _teilnehmer;

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
				if (_ui.get_vornameTextfield().getText().equals("")
						|| _ui.get_nachnameTextfield().getText().equals("")) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Hinweis!");
					alert.setHeaderText("Fehlende Werte gefunden!");
					alert.setContentText(
							"Ein oder mehrere Attribute fehlen in der Eingabemaske. Bitte tragen Sie die Informationen nach und Speichern sie erneut.");

					alert.showAndWait();
				} else {

					_teilnehmer.set_vorname(_ui.get_vornameTextfield().getText());
					_teilnehmer.set_nachname(_ui.get_nachnameTextfield().getText());
					_teilnehmer.setEmail(_ui.get_emailTextfield().getText());

					if (_ui.get_gebuehrCheckbox().isSelected()) {
						_teilnehmer.bezahlt(true);
					} else {
						_teilnehmer.bezahlt(false);
					}

					ServiceManager.teilnehmerservice().wurdeGeaendert();
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
		_ui = (TeilnehmerWerkzeugBearbeitenUI) this.getFxml("fxml/TeilnehmerWerkzeugBearbeitenFxml.fxml");

	}

	/**
	 * Uebergibt die Referenz des ausgewaehlten Teilnehmers an das
	 * BearbeitenWerkzeug.
	 * 
	 * @param teilnehmer
	 */
	public void setzeTeilnehmer(Teilnehmer teilnehmer) {
		_teilnehmer = teilnehmer;

		_ui.get_vornameTextfield().setText(_teilnehmer.get_vorname().get());
		_ui.get_nachnameTextfield().setText(_teilnehmer.get_nachname().get());
		_ui.get_emailTextfield().setText(_teilnehmer.getEmail().get());
		_ui.get_gebuehrCheckbox().setSelected(_teilnehmer.hatBezahlt().get());
	}

}
