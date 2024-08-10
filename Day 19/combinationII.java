// 40. Combination Sum II
import java.util.*;

public class combinationII {
    public void findCombinations(int arr[], int index, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index; i<arr.length; i++) {
            if(i > index && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(arr, i+1, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(candidates, 0, target, ans, new ArrayList<>());

        return ans;
    }
}
