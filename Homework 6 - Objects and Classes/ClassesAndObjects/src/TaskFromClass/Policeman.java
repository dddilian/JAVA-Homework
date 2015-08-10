package TaskFromClass;

public class Policeman extends Employee {

	protected String rank;

	public Policeman(int workHours, int salary, String rank) {
		super(workHours, salary);  //SUPER инициализира полетата от базовия клас преди полетата на класа наследник - задължително SUPER е най-отгоре!!!!
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void sayRank(){
		System.out.println("My rank is: " + this.rank + ".");
	}
}