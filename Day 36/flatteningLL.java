// Flattening a Linked List
import java.util.*;

public class flatteningLL {
    Node flatten(Node root) {
        // code here
        List<Integer> arr = new ArrayList<>();
        
        Node ptr = root;
        while(ptr != null){
            Node subPtr = ptr.bottom;
            while(subPtr != null){
                arr.add(subPtr.data);
                subPtr = subPtr.bottom;
            }
            arr.add(ptr.data);
            ptr = ptr.next;
        }
        
        Collections.sort(arr); 
        
        Node n = new Node(arr.get(0));
        Node p = n;
        for(int i=1; i<arr.size(); i++){
            p.bottom = new Node(arr.get(i));
            p = p.bottom;
        }
        return n;
    }
}
