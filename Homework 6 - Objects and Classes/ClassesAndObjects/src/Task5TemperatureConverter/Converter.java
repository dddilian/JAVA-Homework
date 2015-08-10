package Task5TemperatureConverter;

import java.util.Scanner;

public class Converter {
	public static double convertCelsiusToFarenheit(double temperatureC) {

		double temperatureF = temperatureC * 1.8 + 32;
		return temperatureF;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your body temperature in Celsius degrees: ");
		
		double temperature = input.nextDouble();
		
		temperature = convertCelsiusToFarenheit(temperature);
		
		System.out.printf("Your body temperature in Celsius degrees is %f.%n", temperature);

		input.close();
	}
}
