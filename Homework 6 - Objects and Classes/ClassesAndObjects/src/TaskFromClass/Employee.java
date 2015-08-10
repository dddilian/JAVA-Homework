package TaskFromClass;

public class Employee {

	protected int workHours;
	protected int salary;

	public Employee(int workHours, int salary) {
		super();
		this.workHours = workHours;
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void printInfo(){
		System.out.printf("Hi, I work " + this.workHours + " hours in a month and get " + this.salary + " dollars.");
		
	}
}
