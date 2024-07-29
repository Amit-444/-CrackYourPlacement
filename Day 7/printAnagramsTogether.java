// Print Anagrams Together


import java.util.*;

public class printAnagramsTogether {
    // Sorting Method
    // Same as Group Anagrams
    
    public List<List<String>> Anagrams(String[] str) {
        // Code here
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : str) {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        for(Map.Entry<String, List<String>> e : map.entrySet()) {
            ans.add(e.getValue());
        }
        
        return ans;
    }
}
