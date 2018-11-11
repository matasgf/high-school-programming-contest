import java.io.*;

public class prob09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);

            System.out.printf("%s%n", check(number));
        }
    }

    public static String check(int number) {
        boolean isPerfectSquare = isPerfectSquare(number);
        boolean isPerfectCube = isPerfectCube(number);
        String type = "";

        if (isPerfectSquare && isPerfectCube) {
            type = "BOTH";
        } else if (isPerfectSquare) {
            type = "PERFECT SQUARE";
        } else if (isPerfectCube) {
            type = "PERFECT CUBE";
        } else {
            type = "NEITHER";
        }

        return type;
    }

    public static boolean isPerfectSquare(int number) {
        double squareRoot = Math.sqrt(number);
        return ((squareRoot - Math.floor(squareRoot)) == 0);
    }

    public static boolean isPerfectCube(int number) {
        double cubeRoot = Math.cbrt(number);
        return ((cubeRoot - Math.floor(cubeRoot)) == 0);
    }

}
