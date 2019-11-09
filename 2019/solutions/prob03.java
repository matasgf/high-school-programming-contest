import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prob03 {
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
		for(int i = 0; i < numList.size(); i++)
			if(i == numList.size() - 1)
				System.out.print(numList.get(i));
			else
				System.out.print(numList.get(i) + ", ");
		input.close();
	}
	
}
