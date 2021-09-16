class Solution {
    public int findDuplicate(int[] nums) {
        
        // go through every element
        // at access the element corresponding to num[i]
        // if already negative, element is repeat
        // mark as negative
        
        for( int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i])] < 0) {
                return Math.abs(nums[i]);
            } else {
                nums[Math.abs(nums[i])] *= -1;
            }
        }
        
        return 0;
        
    }
}