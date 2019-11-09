import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prob11 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] spStr = {};
		if(str.length() != 0)
			spStr = str.split(" ");
		for(int i = 0; i < spStr.length; i++) {
			int num = Integer.parseInt(spStr[i]);
			if(numList.contains(num))
				continue;
			else
				numList.add(num);
		}
		Collections.sort(numList);
		String s = "";
		for(int i = 0; i < numList.size(); i++) {
			if(i == 0) 
				s += numList.get(i).toString();
			else if(numList.get(i) - numList.get(i-1)> 1)
				s += ", " + numList.get(i).toString();
			else if(i == numList.size()-1)
				s += "-" + numList.get(i);
			else if(numList.get(i+1) - numList.get(i)> 1)
				s += "-" + numList.get(i).toString();
		}
		System.out.println(s);
		input.close();

	}

}
