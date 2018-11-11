import java.io.*;

public class prob07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String message = line;
            System.out.printf("%s%n", encrypt(message));
        }
    }

    public static String encrypt(String message) {
        int shift = 3;
        String cipher = "";

        for (int i = 0; i < message.length(); i++) {
            char c = (char) (message.charAt(i));
            if (c < 'X')
                cipher += (char) (message.charAt(i) + shift);
            else
                cipher += (char) (message.charAt(i) + shift - 26);
        }

        return cipher;
    }

}
