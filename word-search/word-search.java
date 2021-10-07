class Solution {
    public boolean exist(char[][] board, String word) {
        
        //declare directions up down left right in 2d arr
        //declare recursive function
        
        //for every character in the array find the first character
        // call recursive function on that char
        
        //give it whole word and index of current character
        //if not found yet look all 4 directions
        //  if word is in that direction recurse that way
        //.   mark as visited so we don't go that way again
        //  if last word in in that direction
        //.   return found
        
        //if not found return false
        
        
        int m = board.length;
        int n = board[0].length;
        boolean found = false;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    int[][] visited = new int[m][n];
                    visited[i][j] = 1;
                    // System.out.println(board[i][j]);
                    found = recurseBoard(board, i, j, visited, false, word, 0);
                    if(found == true){
                        return true;
                    }
                }
            }
        } 
        return found;
    }
    
    public boolean recurseBoard (char[][] board, int row, int col, int[][] visited, boolean found, String word, int currentChar){
        int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        if(currentChar == word.length() -1){
            return true;
        }
        
        for(int i = 0; i < directions.length; i++){
            if(found == false){
                int newRow = directions[i][0] + row;
                int newCol = directions[i][1] + col;
                int m = board.length;
                int n = board[0].length;
                if(newRow >= 0 && newCol >= 0 && newRow < m && newCol < n && visited[newRow][newCol] == 0){
                    // System.out.println(word.charAt(currentChar + 1));
                    // System.out.println(board[newRow][newCol]);
                    if((currentChar < word.length() - 1) && word.charAt(currentChar + 1) == board[newRow][newCol]){
                        visited[row][col] = 1;
                        found = recurseBoard(board, newRow, newCol, visited, found, word, currentChar + 1);
                        if(found == true){
                            return found;
                        }
                        visited[row][col] = 0;

                        // return found;
                    }
                }  
            } else{
                return true;
            }
        }
        
        return found;             
    }
}























