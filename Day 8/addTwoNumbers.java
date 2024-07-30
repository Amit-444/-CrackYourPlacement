// 2. Add Two Numbers

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode current = ans;
        int carry = 0;

        while(c1 != null || c2 != null) {
            int sum = carry;

            if(c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if(c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }

            ListNode temp = new ListNode(sum%10);
            current.next = temp;
            current = current.next;
            carry = sum / 10;
        }

        if(carry > 0) {
            ListNode temp = new ListNode(carry);
            current.next = temp;
        }
        return ans.next;
    }
}
