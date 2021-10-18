class Solution {
    public int maxSubArray(int[] nums) {
        
        int running = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
                     
            if(nums[i] > running && running < 0){
                running = nums[i];
            } 
            else{
              running += nums[i];  
            } 
            
            if(running > max){
                max = running;
            }
            
                    
        }
        
        return max;
        
        
        
    }
}