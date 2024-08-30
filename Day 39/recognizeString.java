// 767. Reorganize String
import java.util.*;

public class recognizeString {
    public String reorganizeString(String s) {
        if(s.length()==1) return s;
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);

        for( int value : map.values()){
            if(value==Math.ceil(s.length()+1/2)) return "";
        }
        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));  
        maxheap.addAll(map.keySet());
        char prev = '?';
        StringBuilder result = new StringBuilder();

        while(!maxheap.isEmpty()){
            char current = maxheap.poll();
            result.append(current);
            map.put(current, map.get(current)-1);
            if(prev!='?' && map.get(prev)>0){
                maxheap.add(prev);
            }
            prev = current;
        }
        
        if (result.length() != s.length()) {
            return "";
        }

        return result.toString();
    }
}
