// 21. Merge Two Sorted Lists


public class merge2SOrtedLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode newHead = new ListNode(-1);
        ListNode current = newHead;

        while(cur1 != null && cur2 != null) {
            if(cur1.val <= cur2.val) {
                current.next = cur1;
                current = current.next;
                cur1 = cur1.next;
            }
            else {
                current.next = cur2;
                current = current.next;
                cur2 = cur2.next;
            }
        }

        while(cur1 != null) {
            current.next = cur1;
            current = current.next;
            cur1 = cur1.next;
        }

        while(cur2 != null) {
            current.next = cur2;
            current = current.next;
            cur2 = cur2.next;
        }
        
        return newHead.next;
    }
}
