package controller;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.FactoryConfigurationError;

import modele.Dictionnaire;
import modele.FactoryDictionnaire;
import modele.IModele;
import modele.Mot;
import vue.IVue;
import vue.IVueObservateur;
import vue.IVueRecherche;
import vue.Vue;
import vue.critere.AbstractCritere;

public class Controller implements IVue, IVueObservateur, IVueRecherche, IModele
{
	
	private Map<String, Mot> motsMap;
	private Vue vue;
	private Dictionnaire dictionnaire;
	
	public Controller()
	{
		dictionnaire = new Dictionnaire();
		motsMap = FactoryDictionnaire.getInstance().getMap();
		System.out.println(dictionnaire.getMot("abaissait").getMot());
		
	}

	public List<AbstractCritere> getCriteres() {
		return null;
	}

	public void recherche() {

	}

	public void reset() {

	}

	public void ajouteMot(String mot) {

	}

	public void effaceMot(String mot) {

	}

	public void modifieMot(String mot) {

	}

	public String getDefinitionPourMot(String mot) {
		return null;
	}

	public LocalDateTime getDateModificationPourMot(String mot) {
		return null;
	}

	public LocalDateTime getDateCreationPourMot(String mot) {
		return null;
	}

	public String getImageURLPourMot(String mot) {
		return null;
	}

	public void afficheMessage(String message, boolean isError) {

	}

	public void afficheMotsTrouves(List<String> mots) {

	}

	public String getImageURL() {
		return null;
	}

	public String getDefinition() {
		return null;
	}

	public static void main(String[] args)
	{
		Controller controller = new Controller();
	}

	public String getMot() {
		
		return null;
	}
}
