import java.util.Scanner;

public class prob04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLines = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numLines; i++) {
            String data = input.nextLine();
            int sumDigits = toSumDigits(data);
            System.out.printf("%s %d %s\n", data, toSumDigits(data), isDivisibleByThree(sumDigits) ? "YES" : "NO");
        }
    }

    public static int toSumDigits(String line) {
        int sum = 0;
        for (String s: line.split("")) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    public static boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

}

