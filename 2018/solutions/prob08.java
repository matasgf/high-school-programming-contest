import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class prob08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");

            System.out.printf("%s%n", duplicateWords(words) ? "TRUE" : "FALSE");
        }
    }

    public static boolean duplicateWords(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (!set.add(word)) {
                // Duplicate word found
                return true;
            }
        }

        // No duplicate words were found
        return false;
    }

}
