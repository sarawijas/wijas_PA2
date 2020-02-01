package wijas_p2;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Which formula would you like to use?\n");
		System.out.println("1. BMI = 703*(weight in pounds)/(height in inches)^2\n");
		System.out.println("2. BMI = (weight in kilograms)/(height in meters)^2\n");

		int a = scanner.nextInt();
		
		if(a == 1) {
			double pounds, inches;
			double BMI;
			
			System.out.println("\nPlease enter your weight in pounds: \n");
			pounds = scanner.nextInt();
			
			System.out.println("\nPlease enter your height in inches: \n");
			inches = scanner.nextInt();
			
			BMI = (703*(pounds))/(inches*inches);
			
			System.out.println("\nYour BMI is " + BMI);
		}
		
		if(a == 2) {
			double kilograms, meters;
			double BMI;
			
			System.out.println("\nPlease enter your weight in kilograms: ");
			kilograms = scanner.nextInt();
			
			System.out.println("\nPlease enter your height in meters: ");
			meters = scanner.nextDouble();
			
			BMI = (kilograms)/(meters*meters);
			
			System.out.println("\nYour BMI is " + BMI);
		}
		
		System.out.println("\nThe BMI Categories are as follows: ");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
	}

}
