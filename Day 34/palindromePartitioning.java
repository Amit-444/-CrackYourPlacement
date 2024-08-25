// p131. Palindrome Partitioning
import java.util.*;

public class palindromePartitioning {
    public void findPartitions(int index, String s, List<List<String>> ans, List<String> ds) {
        if(index == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index; i<s.length(); i++) {
            if(isPalindrome(s, index, i)) {
                ds.add(s.substring(index, i+1));
                findPartitions(i+1, s, ans, ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s, int i, int j) {
        while(i <= j) {
            if(s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        findPartitions(0, s, ans, ds);
        return ans;
    }
}
