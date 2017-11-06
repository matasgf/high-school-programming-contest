import java.util.Scanner;

public class prob12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String[] data = input.nextLine().split(" ");
            int num = Integer.parseInt(data[0]);
            if (num == 0) break;
            if (isPolite(num) == 1) {
                System.out.printf("%d is polite\n", num);
            }
            else {
                System.out.printf("%d is not polite\n", num);
            }
        }
    }

    public static int isPolite(int num) {
        // This is a brute force approach. Try every possible combination.
        for (int start = 1; start < num; start++) {
            int sum = 0;
            for (int cur = start; cur < num; cur++) {
                sum = sum + cur;
                // If the sum is equal to the original number, number is polite
                if (sum == num) {
                    return 1;
                }
                if (sum > num) {
                    break;
                }
            }
        }
        // No matches found. Return false.
        return 0;
    }

}

