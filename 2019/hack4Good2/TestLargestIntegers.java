package hack4Good2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestLargestIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
//		System.out.print("Enter integers:");
		String str = input.nextLine();
		String[] spStr = {};
		if(str.length() != 0)
			spStr = str.split(" ");
		if(spStr.length < 3 || spStr.length > 100) {
			System.out.println("The number (N) of integers must be greater equal to 3 and less equal to 100. "
					+ "Please run the program again.");
			System.exit(0);
		}		
		for(int i = 0; i < spStr.length; i++) {
			int num = Integer.parseInt(spStr[i]);
			if(numList.contains(num))
				continue;
			else
				numList.add(num);
		}
		Collections.sort(numList);
		Collections.reverse(numList);
		for(int i = 0; i < 3; i++)
			System.out.print(numList.get(i) + " ");
		input.close();

	}
}
