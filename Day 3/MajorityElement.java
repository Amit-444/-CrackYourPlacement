// 169. Majority Element

import java.util.*;

// Better Approach
// Using HashMap
// public class MajorityElement {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<nums.length; i++) {
//             if(map.containsKey(nums[i])) {
//                 map.put(nums[i], map.get(nums[i])+1);
//             }
//             else {
//                 map.put(nums[i], 1);
//             }
//         }

//         for(Map.Entry<Integer, Integer> e : map.entrySet()) {
//             if(e.getValue() > nums.length/2) return e.getKey();
//         }

//         return -1;
//     }
// }


// Optimal Approach
// Moore's Voting Algorithm
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                count = 1;
                element = nums[i];
            }
            else if(element == nums[i]) count ++;
            else count --;
        }

        int temp = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == element) temp++;
        }

        if(temp > nums.length/2) return element;
        else return -1;
    }
}
