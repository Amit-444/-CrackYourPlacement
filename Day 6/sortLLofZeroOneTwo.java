// Sort a linked list of 0s, 1s and 2s

import org.w3c.dom.Node;

public class sortLLofZeroOneTwo {
    static Node segregate(Node head) {
        // add your code here
        if(head == null || head.next == null) return head;
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zeroHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node current = head;
        
        while(current != null) {
            if(current.data == 0) {
                zero.next = current;
                zero = zero.next;
            }
            else if(current.data == 1) {
                one.next = current;
                one = one.next;
            }
            else {
                two.next = current;
                two = two.next;
            }
            current = current.next;
        }
        
        if(oneHead.next != null) {
            zero.next = oneHead.next;
            one.next = twoHead.next;
        }
        else {
            zero.next = twoHead.next;
        }
        two.next = null;
        
        return zeroHead.next;
    }
}
