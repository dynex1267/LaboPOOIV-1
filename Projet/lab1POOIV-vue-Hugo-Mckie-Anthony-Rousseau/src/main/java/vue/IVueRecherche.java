package vue;

import java.util.List;

import vue.critere.AbstractCritere;

public interface IVueRecherche {
	/**
	 * Retourne une liste des critères de recherche demandé par l'utilisateur.
	 * @return
	 */
	public List<AbstractCritere> getCriteres();
}
