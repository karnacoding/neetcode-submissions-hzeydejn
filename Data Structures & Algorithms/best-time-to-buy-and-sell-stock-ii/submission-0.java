class Solution {
    public int maxProfit(int[] prices) {
        boolean holding = false;
        int buyingDay = 0;
        int start = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] > start){
                // holding = true;
                profit += prices[i]-start;
                start = prices[i];
                //profit = Math.max(profit,prices[i]);
            }else if(start > prices[i]){
                start =prices[i];
            }
        }
        return profit;
    }
}