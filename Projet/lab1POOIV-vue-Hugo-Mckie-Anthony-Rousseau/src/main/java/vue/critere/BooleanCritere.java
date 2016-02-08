package vue.critere;

public class BooleanCritere {
	private boolean estVrai;

	public BooleanCritere(boolean estVrai) {
		super();
		this.estVrai = estVrai;
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

	public boolean isEstVrai() {
		return estVrai;
	}

	public void setEstVrai(boolean estVrai) {
		this.estVrai = estVrai;
	}

}
