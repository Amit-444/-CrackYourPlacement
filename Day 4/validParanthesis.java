// 20. Valid Parentheses


// Using Stack
import java.util.*;
public class validParanthesis {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[') {
                s.push(ch);
            }
            else {
                if(!s.isEmpty()){
                    if(ch == ')' && s.peek() == '(') {
                        s.pop();
                    }
                    else if(ch == '}' && s.peek() == '{') {
                        s.pop();
                    }
                    else if(ch == ']' && s.peek() == '[') {
                        s.pop();
                    }
                    else return false;
                }
                else return false;             
            }
        }

        return s.isEmpty();
    }
}
