// Rotten Oranges
import java.util.*;

public class rottenOranges {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        int time = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty() && freshOranges > 0) {
            int size = queue.size();
            time++; 
            
            for (int i = 0; i < size; i++) {
                int[] rotten = queue.poll();
                int x = rotten[0], y = rotten[1];
                
                for (int[] dir : directions) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    
                    if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2; 
                        queue.offer(new int[]{newX, newY}); 
                        freshOranges--; 
                    }
                }
            }
        }
        
        return freshOranges == 0 ? time : -1;
    }
}
