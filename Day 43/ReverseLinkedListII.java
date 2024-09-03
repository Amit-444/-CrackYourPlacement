// 901. Online Stock Span
import java.util.*;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        ListNode leftnode = head;
        ListNode rightnode = head;
        ListNode prev = null;
        ListNode nextright = null;
        for (int i = 1; i < left; i++) {
            prev = leftnode;
            leftnode = leftnode.next;
        }
        for (int i = 1; i < right; i++) {
            rightnode = rightnode.next;
        }
        nextright = rightnode.next;
        ListNode newhead = reverse(leftnode, rightnode, nextright);
        if (prev != null) {
            prev.next = newhead;
        } else {
            head = newhead;
        }
        return head;
    }

    public ListNode reverse(ListNode t1, ListNode t2, ListNode t3) {
        ListNode curr = t1;
        ListNode prev = null;
        ListNode next = null;
        while (curr != t2) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        t1.next = t3;
        return t2;
    }
}
