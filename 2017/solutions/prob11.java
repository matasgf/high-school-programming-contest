import java.util.Scanner;

public class prob11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String[] data = input.nextLine().split(" ");
            int num = Integer.parseInt(data[0]);
            if (num == 0) break;
            process(num);
        }
    }

    public static int process(int num) {
        // Calculate maximum package count for each package size
        int max13 = (int)(num/13);
        int max11 = (int)(num/11);
        int max7 = (int)(num/7);

        // Loop through each possible combination. Use largest package sizes first.
        for (int pkg13 = max13; pkg13 > 0; pkg13--) {
            for (int pkg11 = max11; pkg11 > 0; pkg11--) {
                for (int pkg7 = max7; pkg7 > 0; pkg7--) {
                    int sum = pkg13 * 13 + pkg11 * 11 + pkg7 * 7;
                    if (sum == num) {
                        // Match found
                        int pkgs = pkg7 + pkg11 + pkg13;
                        System.out.printf("%d %d %d %d %d\n", num, pkg7, pkg11, pkg13, pkgs);
                        return 1;
                    }
                }
            }
        }

        // No valid combinations
        System.out.printf("%d\n", num);
        return 0;
    }

}

