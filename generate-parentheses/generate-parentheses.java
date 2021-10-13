class Solution {
    public List<String> generateParenthesis(int n) {
        
        //declare list of strings return
        List<String> returnList = new ArrayList<>();
        
        //declare recursive func with open paren
        //put 1 less amount open paren as param, and normal amount close
        recurse(returnList, n, 1, n-1, n, "(");
        
        //if current level is equal to amount of pairs
        //if valid sequence
        //. add to list
        
        //if number of open > 1
        //  put open in string
        //  recurse with 1 less open
        //  take off open
        //if number of close > 1 
        //  put close in string
        //. recurse with 1 less close
        //. take off close
        
        return returnList;
    }
    
    public void recurse(List<String> returnList, int n, int currentLevel, int open, int close, String current){
        
        if(currentLevel == n * 2){
            if(validSequence(current)){
                String newStr = current;
                returnList.add(newStr);
            }
        }
        
        if(open >= 1){
            current += "(";
            recurse(returnList, n, currentLevel + 1, open - 1, close, current);
            current = current.substring(0, current.length() - 1);
        }
        if(close >= 1){
            current += ")";
            recurse(returnList, n, currentLevel + 1, open, close - 1, current);
            current = current.substring(0, current.length() - 1);
        }       
    }
    
    public boolean validSequence(String test){
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < test.length(); i++){
            if(test.charAt(i) == '(' ){
                stack.push( "(" );
            }
            
            if(stack.size() != 0 && test.charAt(i) == ')' ){
                stack.pop();
            }
        }
        if(stack.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}














