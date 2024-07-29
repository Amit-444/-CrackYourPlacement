// 49. Group Anagrams

import java.util.*;

public class groupAnagram {

    // Sorting Method
    // public List<List<String>> groupAnagrams(String[] str) {
    //     List<List<String>> ans = new ArrayList<>();
    //     HashMap<String, List<String>> map = new HashMap<>();

    //     for(String s : str) {
    //         char arr[] = s.toCharArray();
    //         Arrays.sort(arr);
    //         String key = new String(arr);

    //         if(!map.containsKey(key)) {
    //             map.put(key, new ArrayList<>());
    //         }
    //         map.get(key).add(s);
    //     }

    //     for(Map.Entry<String, List<String>> e : map.entrySet()) {
    //         ans.add(e.getValue());
    //     }

    //     return ans;
    // }


    // Frequency method

    public String frequency(String str) {
        int freq[] = new int[26];
        // int index = 0;

        for(char c : str.toCharArray()) {
            freq[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for(int val : freq) {
            sb.append(c);
            sb.append(val);
            c++;
        }

        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : str) {
            String keyFreq = frequency(s);

            if (map.containsKey(keyFreq)) {
                map.get(keyFreq).add(s);
            }
            else {
                // else create a new list
                List<String> strList = new ArrayList<>();
                strList.add(s);
                map.put(keyFreq, strList);
            }
        }

        return new ArrayList<>(map.values());
    }
}
