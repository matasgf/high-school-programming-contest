package hack4Good12;

import java.util.Arrays;
import java.util.Scanner;

public class TestRansomNote {

	public static void main(String[] args) {
		int[] upperCase = new int[26];
		Arrays.fill(upperCase, 0);
		int[] lowerCase = new int[26];
		Arrays.fill(lowerCase, 0);
		Scanner input = new Scanner(System.in);
		String magCover = input.nextLine();
		String ransom = input.nextLine();
		for(int i = 0; i < magCover.length(); i++) {
			if(Character.isLetter(magCover.charAt(i))) {
				if(Character.isUpperCase(magCover.charAt(i)))
					upperCase[magCover.charAt(i) - 'A']++;
				if(Character.isLowerCase(magCover.charAt(i)))
					lowerCase[magCover.charAt(i) - 'a']++;
			}
		}
		for(int i = 0; i < ransom.length(); i++) {
			if(Character.isLetter(ransom.charAt(i))) {
				if(Character.isUpperCase(ransom.charAt(i))) {
					upperCase[ransom.charAt(i) - 'A']--;
					if(upperCase[ransom.charAt(i) - 'A'] == -1) {
						System.out.println("false");
						System.exit(0);
					}
				}
				if(Character.isLowerCase(ransom.charAt(i))) {
					lowerCase[ransom.charAt(i) - 'a']--;
					if(lowerCase[ransom.charAt(i) - 'a'] == -1) {
						System.out.println("false");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("true");	
		input.close();
	}

}
