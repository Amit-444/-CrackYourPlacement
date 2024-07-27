// 876. Middle of the Linked List
import java.util.*;


// <-- BruteForce solution -->

// class middleOfLL {
//     public ListNode middleNode(ListNode head) {
//         int count = 0;
//         ListNode current = head;

//         while(current != null) {
//             count ++;
//             current = current.next;
//         }

//         count = (count/2) + 1;
//         ListNode ans = head;

//         while(count > 1) {
//             count--;
//             ans = ans.next;
//         }

//         return ans;
//     }
// }



// Optimal solution
// Tortoise and Haire Algorithm
public class middleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
