// 160. Intersection of Two Linked Lists


public class intersectionOfTwoLL {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;

        while(curA != curB) {
            curA = curA.next;
            curB = curB.next;

            if(curA == curB) return curA;
            else if(curA == null) curA = headB;
            else if(curB == null) curB = headA;
        }

        return curA;
    }
}