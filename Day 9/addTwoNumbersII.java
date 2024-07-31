// 445. Add Two Numbers II

public class addTwoNumbersII {
    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode back = null;

        while(current != null) {
            ListNode front = current.next;
            current.next = back;
            back = current;
            current = front;
        }

        return back;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);
        
        ListNode cur1 = h1;
        ListNode cur2 = h2;
        ListNode ans = new ListNode(-1);
        ListNode current = ans;
        int carry = 0;

        while(cur1 != null || cur2 != null) {
            int sum = carry;
            if(cur1 != null) {
                sum += cur1.val;
                cur1 = cur1.next;
            }
            if(cur2 != null) {
                sum += cur2.val;
                cur2 = cur2.next;
            }

            ListNode temp = new ListNode(sum % 10);
            carry = sum / 10;
            current.next = temp;
            current = current.next;
        }

        if(carry > 0) {
            ListNode temp = new ListNode(carry);
            current.next = temp;
            current = current.next;
        }

        ans = ans.next;
        ans = reverse(ans);
        return ans;
    }
}
