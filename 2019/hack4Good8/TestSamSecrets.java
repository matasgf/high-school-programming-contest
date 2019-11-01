package hack4Good8;

import java.util.Scanner;

public class TestSamSecrets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toLowerCase();
		String[] spStr = {};
		if(str.length() != 0)
			spStr = str.split(" ");
		if(spStr.length < 3) {
			System.out.println("The number (N) of words must be equal to 3. "
					+ "\nPlease run the program again.");
			System.exit(0);
		}		
		int cntS = 0;
		for(int i = 0; i < spStr.length; i++) {
			if(spStr[i].charAt(0) == 's' || spStr[i].charAt(spStr[i].length() - 1) == 's')	
				cntS++;
			if(spStr[i].charAt(0) == 's' && spStr[i].charAt(spStr[i].length() - 1) == 's')	
				cntS--;
		}
		if(cntS == 3)
			System.out.println("welcome");
		else
			System.out.println("denied");
		input.close();
	}

}
