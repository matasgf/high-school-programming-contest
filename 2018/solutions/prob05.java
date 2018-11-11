import java.io.*;

public class prob05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String word = line;
            System.out.printf("%s%n", fold(word));
        }
    }

    public static String fold(String line) {

        boolean state = true;
        int lineLength = line.length();
        int k = 0, i = 0, j = lineLength - 1;
        String reordered = "";

        while (i <= j) {
            if (state) {
                reordered += line.charAt(i++);
            } else {
                reordered += line.charAt(j--);
            }

            k++;
            state = !state;
        }

        return reordered;
    }
}
