import java.util.Scanner;

public class prob06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLines = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numLines; i++) {
            String data = input.nextLine();
            System.out.printf("%s%d\n", data, toCheckDigit(data));

        }
    }


    public static int toCheckDigit(String line){
        int[] intArray = toIntArray(line);
        int total = (intArray[0] * 3) + (intArray[1] * 7) + (intArray[2] * 1) + (intArray[3] * 3) + (intArray[4] * 7) + (intArray[5] * 1) + (intArray[6] * 3) + (intArray[7] * 7);
        return (10 - (total % 10)) % 10;
    }

    public static int[] toIntArray(String line) {
        String[] strArray = line.split("");
        int[] intArray = new int[strArray.length];

        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }
}

