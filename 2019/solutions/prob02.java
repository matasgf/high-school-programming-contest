import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prob02 {

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
		Collections.reverse(numList);
        int vals = 3;
        if(numList.size() < 3)
            vals = numList.size();
		for(int i = 0; i < vals; i++)
			System.out.print(numList.get(i) + " ");
		input.close();

	}
}
