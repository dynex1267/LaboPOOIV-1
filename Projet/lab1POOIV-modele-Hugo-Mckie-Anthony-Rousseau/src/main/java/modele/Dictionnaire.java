package modele;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionnaire {

	private Map<String, Mot> motsMap;

	public Dictionnaire() {
		motsMap = FactoryDictionnaire.getInstance().getMap();
	}
	
	public Mot getMot(String recherche) {
		
		return motsMap.get(recherche);
	}
	
}
