package vue;

import java.time.LocalDateTime;

/**
 * Doit etre implémenter par tous les controleurs qui peuvent recevoir des
 * interactions de l'interface.
 *
 * @author martin
 *
 */
public interface IVueObservateur {
	// Action demandées par l'utilisateur
	/**
	 * Recherche les mots. Les critères de recherche sont obtenus directement
	 * par le controleur via l'interface IVueRecherche.
	 */
	public void recherche();

	/**
	 * Réinitialse le dictionnaire en reprenant les mots de la liste texte originale.
	 */
	public void reset();

	/**
	 * Ajoute un mot.
	 *
	 * @param le
	 *            mot à ajouter
	 */
	public void ajouteMot(String mot);

	/**
	 * Efface un mot.
	 *
	 * @param mot
	 *            le mot à effacer
	 */
	public void effaceMot(String mot);

	/**
	 * Modifie les informations d'un mot. Le controleur doit aller chercher lui
	 * même les informations dans l'interface.
	 *
	 * @param mot
	 *            le mot à modifier.
	 */
	public void modifieMot(String mot);

	/**
	 * Retourne la définition du mot reçu en paramètre.
	 *
	 * @param mot
	 *            le mot
	 * @return la définition. "null" si le mot n'a pas de définition.
	 */
	public String getDefinitionPourMot(String mot);

	/**
	 * Retourne la date de la dernière modification du mot reçu en paramètre.
	 * Tous ls mots ont une date de création. Si le mot n'a pas été modifié
	 * depuis sa création, les dates de création et de modification sont égales.
	 *
	 * @param mot
	 *            le mot
	 * @return la date de modification
	 */
	public LocalDateTime getDateModificationPourMot(String mot);

	/**
	 * Retourne la date de création du mot reçu en paramètre. Tous les mots ont
	 * une date de création.
	 *
	 * @param mot
	 *            le mot
	 * @return la date de création.
	 */
	public LocalDateTime getDateCreationPourMot(String mot);

	/**
	 * Retourne l'url de l'image du mot reçu en paramètre. Le mot peut ne pas
	 * avoir d'iamge
	 *
	 * @param mot
	 * @return l'url de l'image. "null" si le mot n'a pas d'image associée
	 *
	 */
	public String getImageURLPourMot(String mot);

}
