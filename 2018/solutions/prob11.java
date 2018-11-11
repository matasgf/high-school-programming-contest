import java.io.*;

public class prob11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] stats = line.split("\\s+");

            System.out.printf("%.4f%n", sluggingPercentage(stats));
        }
    }

    public static double sluggingPercentage(String[] stats) {

        int at_bats = 0;
        int bases = 0;

        for (String stat : stats) {
            int at_bat = Integer.parseInt(stat);
            if (at_bat == -1)
                continue;

            at_bats += 1;
            bases += at_bat;
        }

        // No duplicate words were found
        return (float) bases / at_bats;
    }

}
