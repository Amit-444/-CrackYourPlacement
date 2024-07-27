// Print all the duplicate characters in a string
import java.util.*;


// Optimal Approach 
// Using Extra Space (HashMap)

public class duplicateCharsInString {
    public static void printDuplicates(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0 ;i<s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            if(e.getValue() > 1) {
                System.out.println(e.getKey() + ", count = " + e.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicates(s);
    }
}