import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLines = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numLines; i++) {
            String[] data = input.nextLine().split(" ");
            System.out.printf("%dF %dF %dMPH\n", toFahrenheit(Integer.parseInt(data[0])), toFahrenheit(Integer.parseInt(data[1])), toMPH(Integer.parseInt(data[2])));
        }
    }

    public static int toFahrenheit(double celsius) {
        return (int)Math.round(9 * (celsius / 5) + 32);
    }

    public static int toMPH(double kilometersPerHour) {
        return (int)Math.round(kilometersPerHour / 1.609344);
    }

}

