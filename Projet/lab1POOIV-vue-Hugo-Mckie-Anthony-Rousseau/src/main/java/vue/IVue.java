package vue;

import java.util.List;

/**
 * Doit etre implémentée par une classe de l'interface pour répondre à tous les
 * controleurs éventuels. Le controleur doit absolument effectuer toutes les
 * interactions avec la vue JavaFx par cette interface
 *
 * @author Martin Simoneau
 * @author Anne Noreau
 *
 */
public interface IVue {


	/**
	 * Demande au GUI d'afficher un message par le GUI
	 *
	 * @param message
	 *            le message à afficher
	 * @param isError
	 *            vrai s'il s'agit d'un message d'erreur ou d'avertissement;
	 *            faux s'il s'agit d'un message d'information
	 */
	public void afficheMessage(String message, boolean isError);

	/**
	 * Affiche tous les mots trouvés
	 *
	 * @param mots
	 *            la liste de mots trouvés
	 */
	public void afficheMotsTrouves(List<String> mots);

	/**
	 * Retourne l'information correspondant au champs mot dans le GUI.
	 *
	 * @return le mot
	 */
	public String getMot();

	/**
	 * Retourne l'url de l'image demandée.
	 *
	 * @return ll'URL de l'image
	 */
	public String getImageURL();

	/**
	 * Retourne la définition pour le mot saisi.
	 */
	public String getDefinition();

}
