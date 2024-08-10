// 90. Subsets II
import java.util.*;

public class subsetII {
    public void getSubs(int arr[], int index, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));

        for(int i=index; i<arr.length; i++) {
            if(i > index && arr[i] == arr[i-1]) continue;

            ds.add(arr[i]);
            getSubs(arr, i+1, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        getSubs(nums, 0, ans, new ArrayList<>());

        return ans;
    }
}
