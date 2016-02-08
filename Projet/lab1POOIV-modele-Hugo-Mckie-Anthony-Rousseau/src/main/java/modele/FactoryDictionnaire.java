package modele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FactoryDictionnaire {

	private static FactoryDictionnaire instance;

	private Properties props;

	private Map<String, Mot> motsMap;

	private FactoryDictionnaire() {
		props = new Properties();

		try {
			lireProprieties();
			creerMotsMap();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static FactoryDictionnaire getInstance() {
		if (instance == null) {
			instance = new FactoryDictionnaire();
		}

		return instance;
	}

	private void lireProprieties() throws IOException {

		InputStream in = null;
		in = this.getClass().getResourceAsStream("../properties.xml");
		props.loadFromXML(in);
		System.setProperties(props);
		in.close();
	}

	public Map<String, Mot> getMap() {
		return motsMap;
	}

	private void creerMotsMap() throws IOException {

		String filePath = "../liste.de.mots.francais.frgut.utf8.txt";
		motsMap = new HashMap<String, Mot>();
		String line = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(filePath)));
		while ((line = in.readLine()) != null) {
			motsMap.put(line, (new Mot(line)));
		}
		in.close();

	}
}
