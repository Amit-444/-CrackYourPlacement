// 901. Online Stock Span
import java.util.*;

public class OnlineStockSpan {

    Stack<Integer> stack;
    ArrayList<Integer> list;
    
    int index = 0;
    
    public StockSpanner() {
        list = new ArrayList<>();
        stack = new Stack<>();
    }
    
    public int next(int price) {
        if (stack.isEmpty()) {
            list.add(price);
            stack.add(index++);
            return 1;
        }
        else {
            list.add(price);
            while (!stack.isEmpty() && list.get(index)>=list.get(stack.peek())) stack.pop();
            int ans = 0;
            if (!stack.isEmpty()) ans = index-stack.peek();
            else ans = index+1;
            stack.add(index++);
            return ans;
        }
    }
}
