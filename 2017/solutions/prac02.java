import java.io.*;
 
public class prac02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
            = new BufferedReader(new InputStreamReader(System.in));
 
        int numCases = Integer.parseInt(reader.readLine());


        while (numCases > 0) {
            --numCases;
            String line[] = reader.readLine().trim().split("\\s+");
            String noun = line[0];
            String verb = line[1];
            System.out.println(noun + " is " + verb + " today!");
        }
    }
}