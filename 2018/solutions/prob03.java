import java.io.*;

public class prob03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(" ");
            double srv_hours = Double.parseDouble(data[0]);
            double srv_rate = Double.parseDouble(data[1]);
            double stor_gb = Double.parseDouble(data[2]);
            double stor_rate = Double.parseDouble(data[3]);
            double bw_gb = Double.parseDouble(data[4]);
            double bw_rate = Double.parseDouble(data[5]);

            double srv_cost = srv_hours * srv_rate;
            double stor_cost = stor_gb * stor_rate;
            double bw_cost = bw_gb * bw_rate;
            double total_cost = srv_cost + stor_cost + bw_cost;
            total_cost = Math.round(total_cost * 100.0) / 100.0;

            System.out.printf("%.2f\n", total_cost);
        }
    }
}
