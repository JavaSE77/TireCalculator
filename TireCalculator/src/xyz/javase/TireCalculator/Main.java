package xyz.javase.TireCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		
		//Declare the input args
		double tire, width, rim, PSI, CFM;
		
		//This is the atmospheric pressure. Should not change.
		double BAR = 15;
		
		//setup reader
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Thank you for using my tire air calculator - Russell (JavaSE)");
		tire = Input.doubleReaderGreaterZero(input, "Please enter your tire size in inches:\n");
		width = Input.doubleReaderGreaterZero(input, "Please enter your tire width in inches:\n");
		rim = Input.doubleReaderGreaterZero(input, "Please enter your rim size in inches:\n");
		PSI = Input.doubleReaderGreaterZero(input, "Please enter the PSI you would like to inflate to:\n");
		CFM = Input.doubleReaderGreaterZero(input, "Please enter the cubic feet per minute (CFM) rating of your air source:\n");
		
		//Do calculations
		Calculator calc = new Calculator();
		
		double cubicInches = calc.inchesOfAir(tire, rim, width);
		//Convert cubic inches to cubic feet.
		double cubicFeet = cubicInches / 1728;
		
		double airAtPSI = ((PSI + BAR)/BAR)*cubicFeet;
		
		double time2fill = airAtPSI/CFM;
		
		System.out.println("At " + PSI + " PSI, it will take " + time2fill + " minutes to fill at " + CFM + " CFM.");
		
	}
}
