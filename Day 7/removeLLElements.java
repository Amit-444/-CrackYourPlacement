// 203. Remove Linked List Elements

public class removeLLElements {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

        while(head != null && head.val == val) head = head.next;

        ListNode current = head;

        while(current != null && current.next != null) {
            if(current.next.val == val) current.next = current.next.next;
            else
            current = current.next;
        }

        return head;
    }
}