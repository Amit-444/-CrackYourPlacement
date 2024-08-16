// 86. Partition List

public class partitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerNode = new ListNode(-1);
        ListNode smaller = smallerNode;
        

        ListNode geraterNode = new ListNode(-1);
        ListNode gerater = geraterNode;

        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                smaller.next = curr;
                smaller = smaller.next;
            } 
            else {
                gerater.next = curr;
                gerater = gerater.next;
            }
            curr = curr.next;
        }
        smaller.next = geraterNode.next;
        gerater.next = null;

        return smallerNode.next;
    }
}
