import java.util.Scanner;

public class prob05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLines = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numLines; i++) {
            String[] data = input.nextLine().split(" ");
            System.out.printf("%s\n",  data[0].replace(data[1], data[2]));
        }
    }
}

