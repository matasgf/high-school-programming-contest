import java.io.*;

public class prob10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);

            System.out.printf("%d%n", countOnes(number));
        }
    }

    public static int countOnes(int number) {
        int oneCounter = 0;

        while (number > 0) {
            oneCounter += number & 1;
            number >>= 1;
        }

        return oneCounter;
    }

}
