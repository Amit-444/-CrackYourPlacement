// 1642. Furthest Building You Can Reach
import java.util.*;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> bricksUsed = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        for(i=0;i<heights.length-1;i++){
            if(heights[i+1] <= heights[i]) continue;

            int diff = heights[i+1] - heights[i];

            if(diff <= bricks){
                bricks -= diff;
                bricksUsed.add(diff);
            }else if( ladders > 0){
                if(!bricksUsed.isEmpty() && bricksUsed.peek() > diff){
                    bricks += (bricksUsed.remove() - diff);
                    bricksUsed.add(diff);
                }
                ladders--;
            }else break;
        }
        return i;
    }
}
