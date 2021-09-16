// import java.ut
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        // get n -> nums.length
        //make array list of all from 1 to n
        // for each number in nums
        // remove from list
        
        //return list
        
        int n = nums.length;
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++){
            result.add(i);
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(result.get(nums[i] - 1) != null) {
                result.set(nums[i] - 1, 0);
            }       
        }
        
        for(int i = 0; i < result.size(); i++) {
            if(result.get(i) == 0){
                result.remove(i);
                i--;
            }
        }
        
        return result;      
    }
}