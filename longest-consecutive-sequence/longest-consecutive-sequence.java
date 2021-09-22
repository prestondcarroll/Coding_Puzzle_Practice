class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        
        
        Arrays.sort(nums);
        
        System.out.println(Arrays.toString(nums));
        int seq = 1;
        int maxSeq = 1;
        int prev= nums[0];
        for(int i = 1; i < nums.length; i++){
           if(nums[i] == prev + 1){
               seq++;
               if(seq > maxSeq){
                 maxSeq = seq;
               }                                
           } 
            else if(prev == nums[i]){
              //do nothing 
           }
            else {
               seq = 1;
           }
            prev = nums[i];
        }
        
        return maxSeq;
        
    }
}