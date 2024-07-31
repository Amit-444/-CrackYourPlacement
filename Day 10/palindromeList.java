// 234. Palindrome Linked List

public class palindromeList {
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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newHead;

        while(second != null) {
            if(first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }
}
