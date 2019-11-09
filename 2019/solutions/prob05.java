import java.util.Scanner;

public class prob05 {

	public static void main(String[] args) {
		int lowerCase = 0;
		int upperCase = 0;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		s = s.replaceAll("[^a-zA-Z]", "");
		
		for(int i = 0; i < s.length(); i++)
			if(Character.isUpperCase(s.charAt(i)))
				upperCase++;
			else
				lowerCase++;
		if(upperCase == lowerCase)
			System.out.println("true");
		else
			System.out.println("false");
		input.close();
	}

}
