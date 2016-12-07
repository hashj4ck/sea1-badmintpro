package services.courtservice;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import materialien.Court;
import services.observer.AbstractObservableService;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 20.11.2016
 * @see services.teilnehmerservice
 * @since 20.11.2016 , 00:05:59
 *
 */
public class CourtServiceImpl extends AbstractObservableService implements CourtService {

	private List<Court> _courtListe;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerServiceImpl.
	 */
	public CourtServiceImpl(List<Court> court) {
		_courtListe = court;
		informiereUeberAenderung();
	}

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerServiceImpl.
	 */
	public CourtServiceImpl() {
		_courtListe = FXCollections.observableArrayList();

		_courtListe.add(new Court("Aussenplatz 1", 1));
		_courtListe.add(new Court("Aussenplatz 2", 1));
		_courtListe.add(new Court("Aussenplatz 3", 1));
		_courtListe.add(new Court("Aussenplatz 4", 1));
		_courtListe.add(new Court("Hallenplatz 1", 1));
		_courtListe.add(new Court("Hallenplatz 2", 1));

		informiereUeberAenderung();
	}

	/**
	 * Ueberschreiben der Methode entferneCourt in der Klasse CourtServiceImpl.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.courtservice.CourtService#entferneCourt(materialien.Court)
	 */
	@Override
	public void entferneCourt(Court Court) {
		_courtListe.remove(Court);
		informiereUeberAenderung();

	}

	/**
	 * Ueberschreiben der Methode fuegeCourtEin in der Klasse CourtServiceImpl.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.courtservice.CourtService#fuegeCourtEin(materialien.Court)
	 */
	@Override
	public void fuegeCourtEin(Court Court) {
		_courtListe.add(Court);
		informiereUeberAenderung();

	}

	/**
	 * Ueberschreiben der Methode enthaeltCourt in der Klasse CourtServiceImpl.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.courtservice.CourtService#enthaeltCourt(materialien.Court)
	 */
	@Override
	public boolean enthaeltCourt(Court Court) {
		return _courtListe.contains(Court);
	}

	/**
	 * Ueberschreiben der Methode getCourtList in der Klasse CourtServiceImpl.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.courtservice.CourtService#getCourtList()
	 */
	@Override
	public List<Court> getCourtList() {
		return new ArrayList<Court>(_courtListe);
	}

	/**
	 * Ueberschreiben der Methode getCourtObservableList in der Klasse
	 * CourtServiceImpl. Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.courtservice.CourtService#getCourtObservableList()
	 */
	@Override
	public ObservableList<Court> getCourtObservableList() {
		return FXCollections.observableArrayList(_courtListe);
	}

	/**
	 * Ueberschreiben der Methode getCourt in der Klasse CourtServiceImpl. Fuer
	 * Details zur Implementierung siehe:
	 * 
	 * @see services.courtservice.CourtService#getCourt(int)
	 */
	@Override
	public Court getCourt(int CourtId) {
		Court result = null;

		for (Court t : _courtListe) {
			if (t.get_courtID().get() == CourtId) {
				result = t;
				break;
			}
		}

		return result;
	}

	/**
	 * Ueberschreiben der Methode wurdeGeaendert in der Klasse CourtServiceImpl.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.courtservice.CourtService#wurdeGeaendert()
	 */
	@Override
	public void wurdeGeaendert() {
		informiereUeberAenderung();

	}

}
