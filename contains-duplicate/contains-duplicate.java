import java.util.HashMap;

class Solution {
    //Find if array has duplicate
    //Input: arr of integers
    //Output: boolean
    //Contstraints: 
    //Edge cases: empty array
    
    //[1, 2, 3, 1]
    //1: 2, 2:1, 3:1
    
    
    public boolean containsDuplicate(int[] nums) {
        
        //iterate through array and keep count of nums
        //if not in map add to it with 1
        //if in array already return false
        
        //return true
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } 
            else {
                return true;
            }
        }
        
        return false;
        
        
    }
}