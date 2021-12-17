class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        PriorityQueue<Integer> heap =
        new PriorityQueue<Integer>(
            intervals.length,
            new Comparator<Integer>() {
              public int compare(Integer a, Integer b) {
                return a - b;
              }
            });
        
        Arrays.sort(intervals, new Comparator<int[]>() {
          public int compare(final int[] a, final int[] b) {
            return a[0] - b[0];
          }
        });
        
        int max = 1;
        int activeRooms = 1;
        //add first meeting to heap
        heap.add(intervals[0][1]);
        
        for(int i = 1; i < intervals.length; i++){
            int[] interval = intervals[i];
            int newStart = interval[0];
            int newEnd = interval[1];
            if(newStart >= heap.peek() ){
                heap.poll();
                heap.add(newEnd);
            }
            else{
                max++;
                heap.add(newEnd);
            }
            
        }
        
        
        return max;
        
        
    }
}