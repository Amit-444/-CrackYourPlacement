// 424. Longest Repeating Character Replacement

public class longestCharRepat {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int length = 0;
        int max = 0;
        int l = 0;
        int r = 0;
        while(r < s.length()) {
            count[s.charAt(r) - 'A']++;
            max = Math.max(max , count[s.charAt(r) - 'A']);
            if(r - l + 1 - max > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
            length = Math.max(length, r - l + 1);
            r++;
        }
        return length;
    }
}
