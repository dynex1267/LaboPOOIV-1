package modele;
import java.time.LocalDateTime;
import java.util.Date;

public class Mot {
	private String mot;
	private String definition;
	private String imageURL;
	private LocalDateTime dateCreation;
	private LocalDateTime dateModification;

	private static final int MAX_DEFINITION_LENGTH = 20;

	public Mot(String mot) {
		this.mot = mot;
		dateCreation = null;
	}

	public String getMot() {
		return mot;
	}

	public boolean setMot(String mot) {
		boolean retour = validerMot(mot);
		if(retour)
			this.mot = mot;
		return retour;
	}

	public String getDefinition() {
		return definition;
	}

	public boolean setDefinition(String definition) {
		boolean retour = validerDefinition(definition);
		if(retour)
			this.definition = definition;
		return retour;

	}

	public String getImageURL() {
		return imageURL;
	}

	public boolean setImageURL(String imageURL) {
		boolean retour = validerImageURL(imageURL);
		if(retour)
			this.imageURL = imageURL;
		return retour;
	}

	public LocalDateTime getDateModification() {
		return dateModification;
	}

	public boolean setDateModification(LocalDateTime dateModification) {
		boolean retour = validerDateModification(dateModification);
		if(retour)
			this.dateModification = dateModification;
		return retour;
	}

	public LocalDateTime getDateCreation() {
		return dateCreation;
	}

	public boolean validerMot(String mot)
	{
		return !mot.isEmpty() && !mot.contains(" ");
	}

	public boolean validerDefinition(String definition)
	{
		int maxLength = MAX_DEFINITION_LENGTH;

		try
		{
			maxLength = Integer.parseInt(System.getProperty("mot.definition.maxLength"));
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}

		return !definition.isEmpty() && definition.length() <= maxLength;
	}

	public boolean validerImageURL(String url)
	{
		return true;
	}

	public boolean validerDateModification(LocalDateTime date)
	{
		return true;
	}
}
