import java.util.Scanner;

public class prob04 {
	public static double WATER_WEIGHT = 62.4;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double force = 0;
		double boatVolume = input.nextDouble();
		double boatWeight = input.nextDouble(); 
		double buoyancy = input.nextDouble();
		input.close();
		force = boatVolume * buoyancy * WATER_WEIGHT;
		if(force >= boatWeight)
			System.out.println("safe");
		else
			System.out.println("heavy");
	}
}
