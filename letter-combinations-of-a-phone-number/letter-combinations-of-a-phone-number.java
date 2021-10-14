class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> returnList = new ArrayList<>();
        if(digits.length() == 0){
            
            return returnList;
        }
        
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        recurse(returnList, map, "", map.get(digits.substring(0, 1)), 1, digits);
        return returnList;
             
    }
    
    public void recurse(List<String> returnList, HashMap<String, String> map, String comb, String currentChars, int currentDigit, String digits){
        if(currentChars == null){
            String newComb = comb;
            returnList.add(newComb);
            return;
        }
        
        
        for(int i = 0; i < currentChars.length(); i++){ 
            comb += currentChars.substring(i, i+1);
            
            String nextChars = null;
            if(currentDigit < digits.length()){
                nextChars = map.get(digits.substring(currentDigit, currentDigit + 1));
            }
     
            
            recurse(returnList, map, comb, nextChars, currentDigit + 1, digits);
            comb = comb.substring(0, comb.length() - 1);
        }
        
         
        
    }
}