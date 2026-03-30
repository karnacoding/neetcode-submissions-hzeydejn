class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int start=0;
        while(start<prices.length){
            int buyingPrice = prices[start];
            for(int pointer=start+1;pointer<prices.length;pointer++){
                if(buyingPrice < prices[pointer]){
                    int profit = prices[pointer] - buyingPrice;
                    if(profit>maxProfit)
                        maxProfit = profit;
                }
            }
            start++;
        }
        return maxProfit;
    }
}
