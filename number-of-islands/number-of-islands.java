class Solution {
    public int numIslands(char[][] grid) {
        
        //for every spot in grid
        //  if 1 start bfs
        //. add to queue
        //. while queue is not empty
        //.   for each direction and in bounds
        //.     if 1 
        //.       add to queue
        //.       turn to 0
        //  add num islands + 1
        int numIslands = 0;
        int[][] directions = new int[][]{{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    bfs(i, j, grid, directions);
                    numIslands++;
                }
            }
        } 
        return numIslands;
    }
    
    public void bfs(int row, int col, char[][] grid, int[][]directions){
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        while(queue.size() != 0){
            int[] current = queue.poll();
            int cRow = current[0];
            int cCol = current[1];
            for(int i = 0; i < 4; i++){
                int newRow = cRow + directions[i][0];
                int newCol = cCol + directions[i][1];
                if(newRow < grid.length && newCol < grid[0].length && newRow >= 0 && newCol >= 0){
                    if(grid[newRow][newCol] == '1'){
                        queue.add(new int[]{newRow, newCol});
                        grid[newRow][newCol] = '0';
                    }
                }
            }
        }
        return;
    }
}
































