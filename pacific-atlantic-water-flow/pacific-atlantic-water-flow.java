class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        //declare 2d arr for pac
        //declare 2d arr for atlantic

        //for each cell top row and first column
        //  add to queue
        //. add to pac arr
        
        //while queue is not empty
        //. current = pop from queue
        //  if top left right or bottom is greater than current and not in pac arr
        //. add to queue
        //. add to pac arr
        
        //repeat for atlantic 
        
        
        //for each cell
        //. if in both pacific and atlantic
        // add to list
        
        //return list
        
        int[][] pacific = new int[heights.length][heights[0].length];
        int[][] atlantic = new int[heights.length][heights[0].length];
        
        int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        
        LinkedList<int[]> pacificQ = new LinkedList<int[]>();
        LinkedList<int[]> atlanticQ = new LinkedList<int[]>();
        
        for(int i = 0; i < heights.length; i++){
            int[] newPacCord = {i, 0};
            pacificQ.add(newPacCord);
            pacific[i][0] = 1;
            
            int[] newAtlCord = {i, heights[0].length -1};
            atlanticQ.add(newAtlCord);
            atlantic[i][heights[0].length - 1] = 1;                      
        }
        
        for(int i = 0; i < heights[0].length; i++){
            int[] newPacCord = {0, i};
            pacificQ.add(newPacCord);
            pacific[0][i] = 1;
            
            int[] newAtlCord = {heights.length - 1, i};
            atlanticQ.add(newAtlCord);
            atlantic[heights.length -1][i] = 1;                      
        }
        
        while(pacificQ.size() != 0){
            int[] current = pacificQ.poll();
            int cRow = current[0];
            int cCol = current[1];
            for(int [] dir : DIRECTIONS){
                int newRow = cRow + dir[0];
                int newCol = cCol + dir[1];
                
                if(newRow < 0 || newCol < 0 || newRow > heights.length - 1 || newCol > heights[0].length - 1){
                    //do nothing
                }
                else if(pacific[newRow][newCol] == 1){
                    //do nothing
                }
                else {
                    if(heights[newRow][newCol] >= heights[cRow][cCol]){
                        int[] newCord = {newRow, newCol};
                        pacificQ.add(newCord);
                        pacific[newRow][newCol] = 1;
                    }
                }
            }
        }
        
        while(atlanticQ.size() != 0){
            int[] current = atlanticQ.poll();
            int cRow = current[0];
            int cCol = current[1];
            for(int [] dir : DIRECTIONS){
                int newRow = cRow + dir[0];
                int newCol = cCol + dir[1];
                
                 if(newRow < 0 || newCol < 0 || newRow > heights.length - 1 || newCol > heights[0].length - 1){
                    //do nothing
                }
                else if(atlantic[newRow][newCol] == 1){
                    //do nothing
                }
                else {
                    if(heights[newRow][newCol] >= heights[cRow][cCol]){
                        int[] newCord = {newRow, newCol};
                        atlanticQ.add(newCord);
                        atlantic[newRow][newCol] = 1;
                    }
                }
            }
        }
        
        List<List<Integer>> returnList = new ArrayList<>();
        
        for(int i = 0; i < heights.length; i++){
            for(int j = 0; j < heights[0].length; j++){
                if(pacific[i][j] == 1 && atlantic[i][j] == 1){
                    List<Integer> cord = new ArrayList<>();
                    cord.add(i);
                    cord.add(j);
                    
                    returnList.add(cord);
                }
            }
        }

        
        return returnList;
      
    }
}

























