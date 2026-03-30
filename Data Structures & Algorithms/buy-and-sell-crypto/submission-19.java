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

            

            // int buyingPrice = prices[start];
            // for(int pointer=start+1;pointer<prices.length;pointer++){
            //     if(buyingPrice < prices[pointer]){
            //         int profit = prices[pointer] - buyingPrice;
            //         if(profit>maxProfit)
            //             maxProfit = profit;
            //     }
            // }
            // start++;
        }
        return maxProfit;
    }
}
