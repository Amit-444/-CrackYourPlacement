// 844. Backspace String Compare
import java.util.*;

public class backSpaceStringCompare {
    public String modify(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != '#') {
                st.push(ch);
            }
            else if(!st.isEmpty()) {
                st.pop();
            }
        }
        return st.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return modify(s).equals(modify(t));
    }
}
