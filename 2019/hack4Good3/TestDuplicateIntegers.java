package hack4Good3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestDuplicateIntegers {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
//		System.out.print("Enter integers:");
		String str = input.nextLine();
		String[] spStr = {};
		if(str.length() != 0)
			spStr = str.split(" ");
		if(spStr.length < 1 || spStr.length > 100) {
			System.out.println("The number (N) of integers must be greater equal to 1 and less equal to 100. "
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
		for(int i = 0; i < numList.size(); i++)
			if(i == numList.size() - 1)
				System.out.print(numList.get(i));
			else
				System.out.print(numList.get(i) + ", ");
		input.close();
	}
	
}
