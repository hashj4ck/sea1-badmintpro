package werkzeuge.abstraction;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 28.11.2016
 * @see werkzeuge.abstraction
 * @since 28.11.2016 , 16:34:58
 *
 */
public interface Subwerkzeug extends Werkzeug {

	/**
	 * Wechselt die mittlere Ansicht des StageWerkzeuges aus.
	 * 
	 * @param paneObject
	 */
	void setzeSubwerkzeug(Subwerkzeug Subwerkzeug);

}
