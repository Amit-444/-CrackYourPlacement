// 78. Subsets
import java.util.*;

public class subset {
    public void getSub(int arr[], int index, List<List<Integer>> ans, List<Integer> ds) {
        if(index == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(arr[index]);
        getSub(arr, index+1, ans, ds);
        ds.remove(ds.size()-1);
        getSub(arr, index+1, ans, ds);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getSub(nums, 0, ans, new ArrayList<>());

        return ans;
    }
}
