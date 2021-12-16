class Solution {
    public int[][] merge(int[][] intervals) {
        
        //make result
        //sort intervals
        //for each interval
        //  
        //. if start and end is null
        //.   grab start and end from current
        //. else if current start is in start and end range
        //.   new end is new current end
        //. else
        //.   add start and end to range
        //.   new start and end is current
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int []> resultLL = new LinkedList<>();
        
        int start = -1;
        int end = -1;
        int count = 0;
        
        for(int[] interval : intervals){
            if(start == -1 && end == -1){
                start = interval[0];
                end = interval[1];
            }
            else if(interval[0] >= start && interval[0] <= end){
                if(interval[1] > end){
                    end = interval[1];
                }
                
            }
            else{
                int[] newRange = new int[2];
                newRange[0] = start;
                newRange[1] = end;
                resultLL.add(newRange);
                count++;
                start = interval[0];
                end = interval[1];
            }
        }
        
        int[] newRange = new int[2];
        newRange[0] = start;
        newRange[1] = end;
        resultLL.add(newRange);
        count++;
        
        
        int[][] result = new int[count][2];
        
        for(int i = 0; i < count; i++){
            result[i] = resultLL.poll();
        }
        
        return result;

        
        
    }
}



















