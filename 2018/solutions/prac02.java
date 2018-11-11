import java.io.*;

public class prac02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String words[] = line.trim().split("\\s+");
            String noun = words[0];
            String verb = words[1];
            System.out.println(noun + " is " + verb + " today!");
        }
    }
}
