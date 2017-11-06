import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numLines = Integer.parseInt(input.nextLine());

        for(int i = 0; i < numLines; i++) {
            String[] data = input.nextLine().split("\\s+");
	    String output = "";
            for (String a: data[0].split("")) {
                for (String b: data[1].split("")) {
                    if(b.equals(a)){
                        for (String c: data[2].split("")) {
                            if(c.equals(a)){
				if (output.indexOf(a) == -1){
				    output = output + a;
				}
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            System.out.printf("%s\n", output);
        }
    }
}

