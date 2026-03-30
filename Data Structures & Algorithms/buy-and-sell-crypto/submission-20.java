class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int start=0;
        int end=prices.length-1;
        while(start<=end){

            if(start==end && prices.length > 1){
                start++;
                end = prices.length-1;
            }

            if(prices[end]>prices[start]){
                System.out.println(end);
                int profit = prices[end] - prices[start];
                if(profit>maxProfit){
                    maxProfit = profit;
                }
                end--;
            }else{
                end--;
            }
        }
        return maxProfit;
    }
}
