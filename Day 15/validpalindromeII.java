// 680. Valid Palindrome II

public class validpalindromeII {
    public boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i < j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                boolean ans1 = isPalindrome(s, i+1, j);
                boolean ans2 = isPalindrome(s, i, j-1);
                return ans1 || ans2;
            }
        }

        return true;
    }
}
