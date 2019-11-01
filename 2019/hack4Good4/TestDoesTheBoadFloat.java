package hack4Good4;

import java.util.Scanner;

public class TestDoesTheBoadFloat {
	public static double WATER_WEIGHT = 62.4;
	public static double SIDE_OUT_50 = 0.50;
	public static double SIDE_OUT_75 = 0.75;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double force = 0;
		double boatVolume = input.nextDouble();
		double boatWeight = input.nextDouble(); 
		double buoyancy = input.nextDouble();
		input.close();
		if(buoyancy == SIDE_OUT_50)
			force = boatVolume * SIDE_OUT_50 * WATER_WEIGHT;
		if(buoyancy == SIDE_OUT_75)
			force = boatVolume * SIDE_OUT_75 * WATER_WEIGHT;
		if(force >= boatWeight)
			System.out.println("safe");
		else
			System.out.println("heavy");
	}
}
