class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for(int i = 1;i<prices.length;i++) {
                int profit = prices[i] - min;
                if(profit>max) {
                    max = profit;
                }
                else if (prices[i]<min) {
                    min = prices[i];
                }
        }
        return max;
    }
}