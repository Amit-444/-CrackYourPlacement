// Directed Graph Cycle
import java.util.*;

public class directedGraphCycle {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] visit = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (DfsDetect(adj, visited, i, visit)) {
                return true;  // Cycle detected
            }
        }
        return false;
    }

    public boolean DfsDetect(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int curr, boolean[] visit) {
        visited[curr] = true;
        visit[curr] = true;

        for (int i = 0; i < adj.get(curr).size(); i++) {
            int v = adj.get(curr).get(i);

            if (visited[v]) {
                return true;  // Cycle detected
            }

            if (!visit[v]) {
                if (DfsDetect(adj, visited, v, visit)) {
                    return true;
                }
            }
        }

        visited[curr] = false;
        return false;
    }   
}
