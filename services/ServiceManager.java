package services;

import services.courtservice.CourtService;
import services.courtservice.CourtServiceImpl;
import services.teilnehmerservice.TeilnehmerService;
import services.teilnehmerservice.TeilnehmerServiceImpl;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 29.11.2016
 * @see services
 * @since 29.11.2016 , 01:21:17
 *
 */
public class ServiceManager {

	private static TeilnehmerService _teilnehmerservice;
	private static CourtService _courtservice;

	/**
	 * Getter-Methode zu _teilnehmerservice. Ermöglicht es einem Klienten, den
	 * Wert der Exemplarvariablen _teilnehmerservice abzufragen.
	 *
	 * @return the _teilnehmerservice
	 */
	public static TeilnehmerService teilnehmerservice() {
		if (_teilnehmerservice == null) {
			_teilnehmerservice = new TeilnehmerServiceImpl();
		}
		return _teilnehmerservice;
	}

	/**
	 * @return
	 */
	public static CourtService courtservice() {
		if (_courtservice == null) {
			_courtservice = new CourtServiceImpl();
		}
		return _courtservice;
	}

}
