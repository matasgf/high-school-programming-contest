package hack4Good7;

import java.util.Scanner;

public class TestDecodeVanityPhoneNumbers {
	public static String decodePhoneNumbers(char c) {
		if(Character.isLetter(c))
			c = Character.toUpperCase(c);
		switch(c) {
			case '0':
				return "0";
			case '1':
				return "1";
			case '2': case 'A': case 'B': case 'C':
				return "2";
			case '3': case 'D': case 'E': case 'F':
				return "3";
			case '4': case 'G': case 'H': case 'I':
				return "4";
			case '5': case 'J': case 'k': case 'L':
				return "5";
			case '6': case 'M': case 'N': case 'O':
				return "6";
			case '7': case 'P': case 'Q': case 'R': case 'S':
				return "7";
			case '8': case 'T': case 'U': case 'V':
				return "8";
			case '9': case 'W': case 'X': case 'Y': case 'Z':
				return "9";
			case '-':
				return "-";
		}
		return "";
	}
	public static void main(String[] args) {
		String s = "";
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i++)
			s += decodePhoneNumbers(charArray[i]);
		System.out.println(s);
		input.close();
	}

}
