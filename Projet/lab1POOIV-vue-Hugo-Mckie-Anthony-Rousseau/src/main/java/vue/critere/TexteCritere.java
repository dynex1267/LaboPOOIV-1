package vue.critere;

public class TexteCritere {
	private String texteRecherche;
	private boolean estComplet;

	public TexteCritere(String texteRecherche, boolean estComplet) {
		super();
		this.texteRecherche = texteRecherche;
		this.estComplet = estComplet;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getTexteRecherche() {
		return texteRecherche;
	}

	public void setTexteRecherche(String texteRecherche) {
		this.texteRecherche = texteRecherche;
	}

	public boolean isEstComplet() {
		return estComplet;
	}

	public void setEstComplet(boolean estComplet) {
		this.estComplet = estComplet;
	}

}
