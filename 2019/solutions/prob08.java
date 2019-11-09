import java.util.Scanner;

public class prob08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toLowerCase();
		String[] words = {};
		if(str.length() != 0)
			words = str.split(" ");
		if(words.length != 3) {
			System.out.println("denied");
			System.exit(0);
		}		
		int welcome = 1;
		for(int i = 0; i < words.length; i++) {
			if(words[i].charAt(0) != 's' && words[i].charAt(words[i].length() - 1) != 's') {
                welcome = 0;
                break;
            }
		}
		if(welcome == 1)
			System.out.println("welcome");
		else
			System.out.println("denied");
		input.close();
	}

}
