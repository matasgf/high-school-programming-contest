import java.util.Scanner;

public class prob10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		StringBuilder sb = new StringBuilder();
        // Convert "1+2-3+4=" to "1 +2 -3 +4"
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '+')
				sb.append(" +");
			else if(s.charAt(i) == '-')
				sb.append(" -");
			else if(s.charAt(i) != '=')
				sb.append(s.charAt(i));
		}
		s = sb.toString();
		String[] strDelim = s.split(" ");
		int sum = 0;
        // Sum each element (1 + +2 + -3 + +4)
		for(int i = 0; i < strDelim.length; i++)
			sum += Integer.valueOf(strDelim[i]);
		System.out.println(sum);
		input.close();
			
	}
}
