package TaskFromClass;

public class EmployeeManipulate {

	public static void main(String[] args) {
		Policeman Jack = new Policeman(100,2000,"Captain");
		Jack.printInfo();
		Jack.sayRank();
		
		Doctor Who = new Doctor(200,4000,15,30);
		Who.printInfo();
		Who.sayShifts();
		
	}
}