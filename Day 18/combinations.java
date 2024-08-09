// 77. Combinations
import java.util.*;

public class combinations {
    public void getCombinations(int index, int n, int k, List<List<Integer>> ans, List<Integer> ds) {
        if(ds.size() == k) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index; i<=n; i++) {
            ds.add(i);
            getCombinations(i+1, n, k, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        getCombinations(1, n, k, ans, new ArrayList<>());

        return ans;
    }
}
