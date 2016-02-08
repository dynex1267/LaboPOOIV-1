package vue.critere;

import java.time.LocalDateTime;

public class DateTimeCritere extends AbstractCritere {
	private LocalDateTime dateTime; // tenir compte de l'heure

	public DateTimeCritere(SorteCritere sorte, LocalDateTime dateTime) {
		super(sorte);
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
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

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

}
