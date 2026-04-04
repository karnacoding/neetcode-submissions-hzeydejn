class Solution {
    public int maxProfit(int[] prices) {
        boolean holding = false;
        int start = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] > start){
                profit += prices[i]-start;
                start = prices[i];
            }else if(start > prices[i]){
                start =prices[i];
            }
        }
        return profit;
    }
}