class Solution {
    public int minSteps(String s, String t) {
        
        int[] first = new int[26];
        int[] second = new int[26];
        int result = 0;
        
        for(int i = 0; i < s.length(); i++){
            first[s.charAt(i) - 'a'] += 1;
            second[t.charAt(i) - 'a'] += 1;            
        }
        
        for(int i = 0; i < 26; i++){
            result += Math.abs(first[i] - second[i]);
        }
        
        return result / 2;
        
    }
}