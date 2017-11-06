import java.util.Scanner;
import java.util.Hashtable;
import java.util.Collections;

public class prob08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();

        while(!data.equals(".")) {

            boolean pangram = true;
            boolean perfect = true;

            Hashtable<String, Integer> letterCounts = getHashTable();
            for (String s: data.split("")) {
                if(letterCounts.containsKey(s)) {
                    int letterCount = letterCounts.get(s);
                    letterCount++;
                    letterCounts.put(s, letterCount);
                    if(letterCount > 1) perfect = false;
                }
            }

            for(String s: Collections.list(letterCounts.keys())){
                if(letterCounts.get(s) < 1){
                    pangram = false;
                }
            }

            System.out.printf("%s: %s\n", pangram ? perfect ? "PERFECT" : "PANGRAM" : "NEITHER" ,data);

            data = input.nextLine();
        }
    }

    public static Hashtable<String, Integer> getHashTable(){
        Hashtable<String, Integer> returnValue = new Hashtable<String, Integer>();
        for (String s: "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("")) {
            returnValue.put(s, 0);
        }
        return returnValue;
    }
}
