// All Unique Permutations of an array
import java.util.*;

public class allUniquePermutations {
    private HashSet<String> st;
    private ArrayList<ArrayList<Integer>> result;
    private int N;

    private void solve(ArrayList<Integer> arr, ArrayList<Integer> temp, boolean[] used) {
        if (temp.size() == N) {
            StringBuilder s = new StringBuilder();
            for (int x : temp) {
                s.append(x);
            }
            if (!st.contains(s.toString())) {
                result.add(new ArrayList<>(temp));
                st.add(s.toString());
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                temp.add(arr.get(i));
                used[i] = true;

                solve(arr, temp, used);

                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        N = n;

        boolean[] used = new boolean[n];
        ArrayList<Integer> temp = new ArrayList<>();
        result = new ArrayList<>();
        st = new HashSet<>();

        arr.sort(null);
        solve(arr, temp, used);

        return result;
    }
}
