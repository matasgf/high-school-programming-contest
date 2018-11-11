import java.io.*;

public class prob06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String number = line;
            System.out.printf("%s%s%n", number, digitOrX(checkdigit(number)));
        }
    }

    public static int checkdigit(String number) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (number.charAt(i) - '0') * (i + 1);
        }

        return sum % 11;
    }

    public static String digitOrX(int digit) {
        if (digit == 10)
            return "X";
        else
            return Integer.toString(digit);
    }
}
