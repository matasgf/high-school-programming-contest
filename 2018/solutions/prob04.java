import java.io.*;

public class prob04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            long n = Long.parseLong(line);

            System.out.printf("%d%n", trib(n));
        }
    }

    public static long trib(long n) {
        if (n == 0)
            return 1;

        if (n == 1)
            return 1;

        if (n == 2)
            return 2;

        return trib(n - 1) + trib(n - 2) + trib(n - 3);
    }
}
