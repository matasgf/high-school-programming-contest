import java.util.Scanner;

public class prob07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctAnswer = Integer.parseInt(input.nextLine());
        int numLines = Integer.parseInt(input.nextLine());
        int currBest = -1;
        String bestNames = "";
        for(int i = 0; i < numLines; i++) {
            String[] data = input.nextLine().split(" ");
            int guess = Integer.parseInt(data[0]);
            int diff = Math.abs(correctAnswer - guess);
            if(currBest == -1){
                currBest = diff;
                bestNames = data[1];
            } else {
                if(diff <= currBest){
                    if(currBest == diff) {
                        bestNames += " " + data[1];
                    } else {
                        bestNames = data[1];
                    }
                    currBest = diff;
                }
            }
        }
        System.out.printf("%s\n", bestNames);
    }
}
