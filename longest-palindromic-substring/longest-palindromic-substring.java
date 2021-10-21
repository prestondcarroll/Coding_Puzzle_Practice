class Solution {
    public String longestPalindrome(String s) {
        
        
        //for each character in string
        //. len = expand around single character
        //. len2 = expand around middle that's between two characters
        //. take max of two
        //. if max > old max
        //.   set new max 
        
        //expand around center
        
        //if left and right character is same
        // move left and right 1
        // continue
        //return diff left minus right
        
        int startMax = 0;
        int endMax = 0;
        int maxLen = 0;
        
        for(int i = 0; i < s.length(); i++){
            int len1 = expand(s, i,i);
            int len2 = expand(s, i, i + 1);
            int tempMaxLen = Math.max(len1,len2);
            if(tempMaxLen > maxLen){              
                startMax = i - (tempMaxLen - 1) / 2;
                endMax = i + (tempMaxLen / 2);
                maxLen = endMax - startMax;
            }            
        }
        
        return s.substring(startMax, endMax + 1);
    
    }
    
    public int expand (String s, int left, int right){
        int L = left;
        int R = right;
        int count = 0;
        while(R < s.length() && L >= 0 && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        
        return R - L - 1;
    }
}



























