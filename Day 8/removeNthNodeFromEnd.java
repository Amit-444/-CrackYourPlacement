// 19. Remove Nth Node From End of List

public class removeNthNodeFromEnd {
    // Approach 1

    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     int size = 0;
    //     ListNode current = head;

    //     while(current != null) {
    //         size ++;
    //         current = current.next;
    //     }

    //     if(size == n) return head.next;
    //     int pos = 1;
    //     current = head;

    //     while(pos < size-n) {
    //         current = current.next;
    //         pos++;
    //     }

    //     current.next = current.next.next;

    //     return head;
    // }

    // Approach 2 (Optimal)

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=0; i<n; i++) {
            fast = fast.next;
        }

        if(fast == null) return head.next;

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
