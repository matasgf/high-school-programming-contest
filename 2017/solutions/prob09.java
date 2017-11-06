import java.util.Scanner;

public class prob09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data = input.nextLine().split(" ");

        while(!data[0].equals("0") && !data[1].equals("0")) {

            double coefficient = Double.parseDouble(data[0]);
            int exponent = Integer.parseInt(data[1]);

            System.out.printf("%.2f\n", coefficient * Math.pow((double)10, (double)exponent));
            data = input.nextLine().split(" ");
        }
    }
}
