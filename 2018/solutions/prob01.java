import java.io.*;

public class prob01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(" ");
            double liters = Double.parseDouble(data[0]);
            double density_kg_l = Double.parseDouble(data[1]);
            double mass_kg = (liters * density_kg_l);
            double mass_lb = mass_kg * 2.2;
            System.out.printf("%.2f\n", mass_lb);
        }
    }
}
