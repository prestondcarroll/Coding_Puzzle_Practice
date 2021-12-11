class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        if(intervals.length == 0){
            return true;
        }
        Arrays.sort(intervals, (a,b) -> Double.compare(a[0], b[0]));
        int begin = intervals[0][0];
        int end = intervals[0][1];
        // int possible = true;
        
        for(int i = 1; i < intervals.length; i++){
            int newBegin = intervals[i][0];
            int newEnd = intervals[i][1];
            
            if(newBegin < end && newBegin > begin){
                return false;
            }
            else if(newEnd < end && newEnd > end){
                return false;
            }
            else if(newBegin == begin){
                return false;
            }
            
            
            begin = newBegin;
            end = newEnd;
        }
        
        return true;
        
        
        
        
    }
}