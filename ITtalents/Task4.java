
public class Task4 {
	public static void main(String[] args) {
		
		int x = 13;
		
		boolean isPrime = true;
		
		for(int i = 2; i<x; i++) {  //почва от i=2, за да избегне единицата и ще търси число до Х, и ако има такова, значи Х не е просто
			if(x % i == 0) {
				isPrime = false; // флагчето става false
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime!");
		}	
	}
}
