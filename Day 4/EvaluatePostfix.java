// Evaluation of Postfix Expression
import java.util.*;

public class EvaluatePostfix {
    public static int evaluatePostFix(String s) {
        // Your code here
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch >= '0' && ch <= '9') {
                st.push(Character.getNumericValue(ch));
            }
            else if(!st.isEmpty()) {
                int top1 = st.pop();
                int top2 = st.pop();
                if(ch == '+') {
                    int ans = top2 + top1;
                    st.push(ans);
                }
                else if(ch == '/') {
                    int ans = top2 / top1;
                    st.push(ans);
                }
                else if(ch == '*') {
                    int ans = top2 * top1;
                    st.push(ans);
                }
                else {
                    int ans = top2 - top1;
                    st.push(ans);
                }
            }
        }
        
        return st.peek();
    }
}
