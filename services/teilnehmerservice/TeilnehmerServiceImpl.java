package services.teilnehmerservice;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import materialien.Teilnehmer;
import services.observer.AbstractObservableService;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 20.11.2016
 * @see services.teilnehmerservice
 * @since 20.11.2016 , 00:05:59
 *
 */
public class TeilnehmerServiceImpl extends AbstractObservableService implements TeilnehmerService {

	private List<Teilnehmer> _teilnehmerListe;

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerServiceImpl.
	 */
	public TeilnehmerServiceImpl(List<Teilnehmer> teilnehmer) {
		_teilnehmerListe = teilnehmer;
		informiereUeberAenderung();
	}

	/**
	 * Konstruktor fuer neue Exemplare der Klasse TeilnehmerServiceImpl.
	 */
	public TeilnehmerServiceImpl() {
		_teilnehmerListe = FXCollections.observableArrayList();

		_teilnehmerListe.add(new Teilnehmer("Hans", "Mueller", "hansmueller@yahoo.de", 2));
		_teilnehmerListe.add(new Teilnehmer("Elisabeth", "Schneider", "elisabethschneider@gmail.de", 1));
		_teilnehmerListe.add(new Teilnehmer("Anton", "Hoffmann", "a.hoffmann@gmx.de", 4));
		_teilnehmerListe.add(new Teilnehmer("Christian", "Bargmann", "h4ckj4ck@t0r.de", 3));
		informiereUeberAenderung();
	}

	/**
	 * Ueberschreiben der Methode entferneTeilnehmer in der Klasse
	 * TeilnehmerService. Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.teilnehmerservice.TeilnehmerService#entferneTeilnehmer(materialien.Teilnehmer)
	 */
	@Override
	public void entferneTeilnehmer(Teilnehmer teilnehmer) {
		_teilnehmerListe.remove(teilnehmer);
		informiereUeberAenderung();

	}

	/**
	 * Ueberschreiben der Methode fuegeTeilnehmerEin in der Klasse
	 * TeilnehmerService. Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.teilnehmerservice.TeilnehmerService#fuegeTeilnehmerEin(materialien.Teilnehmer)
	 */
	@Override
	public void fuegeTeilnehmerEin(Teilnehmer teilnehmer) {
		_teilnehmerListe.add(teilnehmer);
		informiereUeberAenderung();

	}

	/**
	 * Ueberschreiben der Methode enthaeltTeilnehmer in der Klasse
	 * TeilnehmerService. Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.teilnehmerservice.TeilnehmerService#enthaeltTeilnehmer(materialien.Teilnehmer)
	 */
	@Override
	public boolean enthaeltTeilnehmer(Teilnehmer teilnehmer) {
		return _teilnehmerListe.contains(teilnehmer);
	}

	/**
	 * Ueberschreiben der Methode getTeilnehmerList in der Klasse
	 * TeilnehmerService. Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.teilnehmerservice.TeilnehmerService#getTeilnehmerList()
	 */
	@Override
	public List<Teilnehmer> getTeilnehmerList() {
		return _teilnehmerListe.subList(0, _teilnehmerListe.size());
	}

	/**
	 * Ueberschreiben der Methode getTeilnehmerList in der Klasse
	 * TeilnehmerService. Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.teilnehmerservice.TeilnehmerService#getTeilnehmerList()
	 */
	@Override
	public ObservableList<Teilnehmer> getTeilnehmerObservableList() {
		return FXCollections.observableArrayList(_teilnehmerListe);
	}

	/**
	 * Ueberschreiben der Methode getTeilnehmer in der Klasse TeilnehmerService.
	 * Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.teilnehmerservice.TeilnehmerService#getTeilnehmer(int)
	 */
	@Override
	public Teilnehmer getTeilnehmer(int teilnehmerId) {
		Teilnehmer result = null;

		for (Teilnehmer t : _teilnehmerListe) {
			if (t.get_teilnehmerNummer().get() == teilnehmerId) {
				result = t;
				break;
			}
		}

		return result;
	}

	/**
	 * Ueberschreiben der Methode wurdeGeaendert in der Klasse
	 * TeilnehmerService. Fuer Details zur Implementierung siehe:
	 * 
	 * @see services.teilnehmerservice.TeilnehmerService#wurdeGeaendert()
	 */
	@Override
	public void wurdeGeaendert() {
		informiereUeberAenderung();

	}

}
