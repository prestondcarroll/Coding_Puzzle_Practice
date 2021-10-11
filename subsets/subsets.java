class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        //add empty set to list
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        
        returnList.add(emptyList);
        
        
        //declare recursive func
        
        //for each number starting at start point
        //. if in range
        //.   add to list
        //.   add to powerset 
        //. recurse with start point at next
        //. remove from list
        
        recurse(0, nums, returnList, new ArrayList<Integer>());
        
        
        return returnList;
        
    }
    
    public void recurse(int start, int[] nums, List<List<Integer>> returnList, List<Integer> currentList){
        
        for(int i = start; i < nums.length; i++){
            currentList.add(nums[i]);
            List<Integer> newList = new ArrayList<>(currentList);
            returnList.add(newList);
            
            recurse(i+1, nums, returnList, currentList);
            currentList.remove(currentList.size() - 1);
        }
              
    }
}


























