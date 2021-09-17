class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        //go to nums[i] spot in arr
        //if already negative add to return arr
        //else make negative
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]) - 1] < 0) {
                result.add(Math.abs(nums[i]));
            }
            else {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        return result;
        
    }
}