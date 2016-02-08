package vue.critere;

public abstract class AbstractCritere {
	private SorteCritere sorte;

	public AbstractCritere(SorteCritere sorte) {
		super();
		this.sorte = sorte;
	}

	public String toString() {
		return sorte.toString();
	}

	public boolean equals(Object other) {
		return sorte.equals(other);
	}

	public int hashCode() {
		return sorte.hashCode();
	}

	public int compareTo(SorteCritere o) {
		return sorte.compareTo(o);
	}

	public SorteCritere getSorte() {
		return sorte;
	}

	public void setSorte(SorteCritere sorte) {
		this.sorte = sorte;
	}

}
