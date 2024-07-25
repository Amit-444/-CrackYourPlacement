// 121. Best Time to Buy and Sell Stock
// Solved by Arrays, will solve it later via DP

// Normal Approach

public class bestTimeToBuyAndSellStock {
    public int maxProfit(int[] arr) {
        int profit = 0;
        int mini = arr[0];

        for(int i=1; i<arr.length; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(cost, profit);
            mini = Math.min(arr[i], mini);
        }

        return profit;
    }
}
