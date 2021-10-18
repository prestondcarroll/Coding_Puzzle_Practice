class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //create hash map with integer and integer indicating index
        
        //for each element in array
        //. find other half
        //. if other half in hash map
        //    return this index and hashmap index
        //  add element and index to hash map
        
        //return error
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int otherHalf = target - nums[i];
            if(map.get(otherHalf) != null){
                int[] result = new int[2];
                result[0] = i;
                result[1] = map.get(otherHalf);
                return result;
            }
            map.put(nums[i], i);
        }
        
        return null;

        
        
    }
}