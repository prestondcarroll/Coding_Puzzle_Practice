class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        //recurse
        
        //for every number
        //. if 3 levels deep
        //. if number is equal to target add to list
        //. recurse with next number, add to list
        //. take out of list once done with recursion
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        recurse(returnList, k, n, 0, 1, sumList);
        
        return returnList;
           
    }
    
    public void recurse (List<List<Integer>> list, int k, int target, int currentLevel, int startIdx, List<Integer> sumList){
        
        int total = 0;
        for(int j = 0; j < sumList.size(); j++){
            total += sumList.get(j);
        }

        if(currentLevel == k && total == target){ 
            List<Integer> newList = new ArrayList<Integer>(sumList);
            list.add(newList);
            return;
        }
        if(currentLevel >= k){
            return;
        }
            
        for(int i = startIdx; i <= 9; i++){
            
            System.out.println(i);

            sumList.add(i);         
            recurse(list, k, target, currentLevel + 1, i+1, sumList);
            sumList.remove(sumList.size() - 1);                   
        }
               
    }
}