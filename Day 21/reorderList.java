// 143. Reorder List

public class reorderList {
    public void reOrderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=Findmid(head);
        ListNode head2=Reverse(mid);
        mid.next=null;
        head=RecordList(head,head2);
    }

    public static ListNode Findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode Reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head.next;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
    
    public static ListNode RecordList(ListNode head1 , ListNode head2){
        ListNode Original=head1;
        while(head1!=null && head2!=null){
            ListNode temp1=head1.next;
            ListNode temp2=head2.next;
            head1.next=head2;
            head2.next=temp1;
            head1=temp1;
            head2=temp2;
        }
        return Original;
    }
}
