import java.util.Arrays;
import java.util.Scanner;

public class prob13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message = input.nextLine();
		String s = "";
		char[] charArray = message.toCharArray();
		for(int i = 0; i < charArray.length; i++)
			if(Character.isLetter(charArray[i]))
				s += Character.isLowerCase(charArray[i]) ? (char)((charArray[i] - 'a' + 13) % 26 + 'a') : 
							(char)((charArray[i] - 'A' + 13) % 26 + 'A');
			else
				s += Character.toString(charArray[i]);
		System.out.println(s);
	}

}
