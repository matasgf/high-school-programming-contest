package hack4Good6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestClosestIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] spStr = {};
		if(str.length() != 0)
			spStr = str.split(" ");
		if(spStr.length < 3) {
			System.out.println("The number (N) of integers must be greater equal to 2. Integer values between -100 and 100. "
					+ "\nPlease run the program again.");
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
		int diff = 1000, seqNumDiff = 0, prev = 0, next = 0;
		for(int i = 0; i < numList.size() - 1; i++) {
			seqNumDiff = numList.get(i + 1) - numList.get(i);
			if(seqNumDiff < diff) {
				diff = seqNumDiff;
				prev = i;
				next = i + 1;
			}
		}
		System.out.print(numList.get(prev) + " " + numList.get(next));
		input.close();

	}

}
