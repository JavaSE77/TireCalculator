package xyz.javase.TireCalculator;

public class Calculator {

	public Calculator()  {
		
	}
	
	/**
	 * @param double tire, double rim, double width, all in inches.
	 * @return returns the cubic inches of air in the tire
	 * */
	public double inchesOfAir(double tire, double rim, double width) {
		
		//This is all the air in the tire if the tire had no rim
		double uv = Math.pow((tire/2), 2)*Math.PI;
		//This is all the air in the rim
		double vdu = Math.pow((rim/2), 2)*Math.PI;
		
		//volume of a cylinder V = H*pi*(R^2)
		return (uv - vdu) * width;
	}
	
}
