import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLines = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numLines; i++) {
            String[] data = input.nextLine().split(" ");
            System.out.printf("%.2f\n", profit(Float.parseFloat(data[0]),Float.parseFloat(data[1]), Float.parseFloat(data[2]), Integer.parseInt(data[3])));
        }
    }

    public static float profit(float fixedCost, float shirtCost, float shirtPrice, int shirtCount) {
	float shirtProfit = (shirtPrice - shirtCost) * shirtCount;
        return shirtProfit - fixedCost;
    }

}

