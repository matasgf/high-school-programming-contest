import java.io.*;

public class prob12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        // Read 5x5 Sator Square into 25 character input string
        String line = null;
        String input = "";
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            input = words[0] + input;
        }

        System.out.printf("%s%n", isSatorSquare(input) ? "TRUE" : "FALSE");
    }

    public static boolean isSatorSquare(String input) {

        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();

        return (input.equals(reverse));
    }

}
