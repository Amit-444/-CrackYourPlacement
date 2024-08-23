// 907. Sum of Subarray Minimums
import java.util.*;

public class sumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for (int right = 0; right <= arr.length; ++right) {
            while (!stack.isEmpty() && (right == arr.length || arr[stack.peek()] >= arr[right])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                res = (int) ((res + (right - mid) * (mid - left) * (long) arr[mid]) % mod);
            }
            stack.push(right);
        }

        return res;
    }
}
