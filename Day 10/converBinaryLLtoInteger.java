// 1290. Convert Binary Number in a Linked List to Integer

public class converBinaryLLtoInteger {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        
        while(head != null) {
            ans = ans * 2;
            ans = ans + head.val;
            head = head.next;
        }

        return ans;
    }
}
