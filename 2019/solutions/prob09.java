import java.util.HashMap;
import java.util.Scanner;

public class prob09 {

	public static void main(String[] args) {
		HashMap <String, String> hashMap = new HashMap<String, String>();
		Scanner input = new Scanner(System.in);
		String message = input.nextLine();
		String encMessage = input.nextLine();
		String[] spStr1 = {};
		if(message.length() != 0)
			spStr1 = message.split(" ");
		for(int i = 0; i < spStr1.length; i++)
			if(i % 2 == 0 && !hashMap.containsKey(spStr1[i]))
				hashMap.put(spStr1[i], spStr1[i+1]);
		String[] spStr2 = {};
		if(encMessage.length() != 0)
			spStr2 = encMessage.split(" ");
		for(int i = 0; i < spStr2.length; i++) {
            if(hashMap.get(spStr2[i]) != null)
			    System.out.print(hashMap.get(spStr2[i]) + " ");
		}
		input.close();
	}

}
