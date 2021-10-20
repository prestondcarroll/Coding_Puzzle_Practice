class Solution {
    public int numDecodings(String s2) {
        
        //do first and second
        //for length of string build out dp array
        //add first amount prev
        //check if prev 2 is < 26
        // if it is 
        //. add prev 2 of dp arr
//         String s2;
//         int start = 0;
//         while(start < s.length() && s.charAt(start) == '0'){
//             start++;
//         }
        
//         s2 = s.substring(start, s.length());
//         if(s2.length() <= 0){
//             return 0;
//         }
//         System.out.println(s2);
        
        if(s2.charAt(0) == '0'){
            return 0;
        }
        
        int[] dp = new int[s2.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i < s2.length() + 1; i++){
            int prev1 =  Integer.valueOf(s2.substring(i-1, i));
            if(prev1 > 0 && prev1 <= 9){
                dp[i] = dp[i-1];
            }            
            int prev2 = Integer.valueOf(s2.substring(i-2, i));
            if(prev2 >= 10 &&  prev2 <= 26){
                dp[i] += dp[i-2];
            }
        }
        
        return dp[s2.length() ];
       
    }
    
}