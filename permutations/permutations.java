class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        //declare returnList
        //declare recursive function
        
        
        //for each in set
        //  if none in working set add combo to return list
        //.   return
        //
        //  add first from working set to permutation combo
        //  remove from working set
        //  recurse with new working set
        //. put back removed element to end of working set
        
        List<List<Integer>> returnList = new ArrayList<>();
        LinkedList<Integer> workingSet = new LinkedList<>();
        for(int i = 0; i < nums.length; i++){
            workingSet.push(nums[i]);
        }
        recurse(returnList, nums, new ArrayList<Integer>());
        
        return returnList;
        
    }
    
    public void recurse(List<List<Integer>> returnList, int[] nums, List<Integer> combo){
        if(combo.size() == nums.length){
            returnList.add(new ArrayList<>(combo));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(combo.contains(nums[i])){
                continue;
            } else{
                combo.add(nums[i]);
                recurse(returnList, nums, combo);
                combo.remove(combo.size() - 1);
            }
        }
        
    }
}