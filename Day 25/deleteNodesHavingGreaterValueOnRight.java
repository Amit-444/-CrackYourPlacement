// Delete nodes having greater value on right

public class deleteNodesHavingGreaterValueOnRight {
    Node compute(Node head) {
        if(head == null) {  
            return null;
        }
        
        Node temp;
        Node prev; 
        
        Node node = null;
        while(head != null) {
            temp = head;
            head = head.next;
            temp.next = node;
            node = temp;
        }
        
        temp = node.next;
        prev = node;
        while(temp != null) {
            if(prev.data > temp.data) {
                prev.next = temp.next;
                temp = temp.next;
            }
            else {
                prev = prev.next;
                temp = temp.next;
            }
        }
        
        while(node != null) {
            temp = node;
            node = node.next;
            temp.next = head;
            head = temp;
        }
        
        return head;
    }
}
