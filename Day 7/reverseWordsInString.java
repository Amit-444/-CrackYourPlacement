// 151. Reverse Words in a String

// Approach 1;
// public class reverseWordsInString {
//     public String reverseWords(String s) {
//         String words[] = s.trim().split("\\s+");
//         String ans = "";

//         for(int i=words.length-1; i>0; i--) {
//             ans = ans + words[i] + " ";
//         }

//         return ans + words[0];
//     }
// }


// Approach 2

import java.util.ArrayList;
import java.util.List;

public class reverseWordsInString {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        int i = 0;
        int k = s.length()-1;

        // Removing spaces from end
        while(k > 0 && s.charAt(k) == ' ') k--;

        while(i <= k) {
            // Removing leading spaces
            while(i < s.length() && s.charAt(i) == ' ') i++;
            int start = i;
            while(i <s.length() && s.charAt(i) != ' ') i++;

            // Adding Words to the list
            words.add(s.substring(start, i));
        }

        String ans = "";
        // Reverse
        for(int j = words.size()-1; j>0; j--) {
            ans += words.get(j) + " ";
        }

        return ans + words.get(0);
    }
}
