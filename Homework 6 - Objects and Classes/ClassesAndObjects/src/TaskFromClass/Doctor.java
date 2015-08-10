package TaskFromClass;

public class Doctor extends Employee {

	protected int nightShifts;
	protected int dayShifts;

	public Doctor(int workHours, int salary, int nightShifts, int dayShifts) {
		super(workHours, salary);
		this.nightShifts = nightShifts;
		this.dayShifts = dayShifts;
	}

	public int getNightShifts() {
		return nightShifts;
	}

	public void setNightShifts(int nightShifts) {
		this.nightShifts = nightShifts;
	}

	public int getDayShifts() {
		return dayShifts;
	}

	public void setDayShifts(int dayShifts) {
		this.dayShifts = dayShifts;
	}
	
	public void sayShifts() {
		System.out.printf("Last month I had " + this.nightShifts + " night shifts and " + this.dayShifts + " day shifts.");
	}
}