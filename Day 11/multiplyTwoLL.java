// Multiply two Linked list

public class multiplyTwoLL {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long a = 0;
        long b = 0;
        long res = 1;
        long mod = 1000000007;
        Node cur1 = first;
        Node cur2 = second;
        
        while(cur1 != null || cur2 != null) {
            if(cur1 != null) {
                a = (a * 10) % mod + cur1.data;
                cur1 = cur1.next;
            }
            
            if(cur2 != null) {
                b = (b * 10) % mod + cur2.data;
                cur2 = cur2.next;
            }
        }
        
        return (a * b) % mod;
    }
}
