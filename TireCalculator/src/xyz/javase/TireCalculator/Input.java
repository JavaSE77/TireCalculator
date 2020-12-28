package xyz.javase.TireCalculator;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {

	
	/**
	 * Returns an input from buffered reader. 
	 * @param buffered reader
	 * @return double
	 * returns 0 on failure
	 * */
	public static double doubleReaderGreaterZero(BufferedReader input, String output) {
		
		boolean validInput = false;
		int failures = 0;
		double out = 0;
		
		while(!(validInput)) {
			System.out.println(output);
		try {
			out = Double.parseDouble(input.readLine());
			if(out > 0) {
				validInput = true;
			} else {
				validInput = false;
				System.out.println("Please enter a valid greater then 0\n");
			}
		} catch (NumberFormatException e) {
			validInput = false;
			System.out.println("Please enter a valid number!\n");
		} catch (IOException e) {
			validInput = false;
			System.out.println("IO Error!\n");
			//Make sure we don't have more than 3 IO errors.
			if(failures >= 3) {
				System.out.println("\033[4;31m" + "Critical error has occured. See stack trace;\n" + "\033[0m");
				e.printStackTrace();
				return 0;
			} else {
				failures++;
			}
		}
		}
		
		return out;
	}
	
}
