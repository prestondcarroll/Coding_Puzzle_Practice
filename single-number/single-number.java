import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null && map.get(nums[i]) == 1){
                map.put(nums[i], 2);
                map2.remove(nums[i]);            
            } else {
                map.put(nums[i], 1);
                map2.put(nums[i], 1);
            }
        }
        
        for(Integer result : map2.keySet()){
            return result;
        }
        
        return 0;
        
    }
}