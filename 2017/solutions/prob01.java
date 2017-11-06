import java.util.Scanner;

public class prob01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLines = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numLines; i++) {
            String[] data = input.nextLine().split(" ");
            System.out.printf("%.2f\n", toKg(Float.parseFloat(data[0]), Float.parseFloat(data[1])));
        }
    }

    public static float toKg(float gallons, float poundsPerGallon) {
        float poundsPerKilogram = (float)2.2;
        return gallons * poundsPerGallon / poundsPerKilogram;
    }

}

