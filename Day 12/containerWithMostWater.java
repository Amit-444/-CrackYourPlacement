// 11. Container With Most Water

public class containerWithMostWater {
    
    // <-- Bruteforce Approach -->

    // public int maxArea(int[] height) {
    //     int ans = 0;

    //     for(int i=0; i<height.length; i++) {
    //         for(int j=i+1; j<height.length; j++) {
    //             int area = Math.min(height[i], height[j]) * (j - i);
    //             ans = Math.max(ans, area);
    //         }
    //     }

    //     return ans;
    // }


    
    // <-- Optimal Two-pointer Approach -->

    public int maxArea(int[] height) {
        int ans = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            ans = Math.max(ans, area);

            if(height[i] < height[j]) i++;
            else j--;
        }

        return ans;
    } 
}
