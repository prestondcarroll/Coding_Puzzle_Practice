class Solution {
    public int lengthOfLIS(int[] nums) {
        
        //declare all dp to be 1
        //
        
        //for every element i starting at second
        //. for every element j previous starting at 0
        //.   if(element j < element i)
        //.     dp[i] = max of adding one to dp j or dp i
        
        
        //return largest part of dp arr
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        int longest = 0;
        for(int num: dp){
            longest = Math.max(num, longest);
        }
        
        return longest;
        
    }
}