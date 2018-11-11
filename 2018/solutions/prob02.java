import java.io.*;

public class prob02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(" ");
            double f1 = Double.parseDouble(data[0]);
            double f2 = Double.parseDouble(data[1]);
            double f3 = Double.parseDouble(data[2]);
            double f4 = Double.parseDouble(data[3]);
            double f5 = Double.parseDouble(data[4]);
            double total_mb = f1 + f2 + f3 + f4 + f5;
            double total_gb = total_mb / 1024.0;
            total_gb = Math.round(total_gb * 2.0) / 2.0;
            System.out.printf("%.1f\n", total_gb);
        }
    }
}
