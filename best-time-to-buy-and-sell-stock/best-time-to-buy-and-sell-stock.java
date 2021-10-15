class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 1){
            return 0;
        }
        
        int[] dp = new int[prices.length];
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        dp[0] = 0;
        min = prices[0];
        max = prices[0];
        
        if(prices[1] < min){
            min = prices[1];
        }
        if(prices[1] > max){
            max = prices[1];
        }
        
        dp[1] = prices[1] - prices[0] > 0 ? prices[1] - prices[0] : 0;
        // int maxProfit = dp[1];
        
        
        for(int i = 2; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
                dp[i] = dp[i-1];
            } else{
                dp[i] = prices[i] - min > dp[i-1] ? prices[i] - min : dp[i-1];
            }          
        }
        
        return dp[prices.length - 1];
        
    }
}