class Solution {
    public void setZeroes(int[][] matrix) {
        
        //find first 0 in arr
        //. once found set all in row to -1 
        //  set all in col to -1
        //save as col and row set
        
        //go through matrix
        // if found 0
        //. set spot in row set to 0
        //  set spot in col set to 0
        
        //for every index in row set
        //. if 0
        //. set everything in that row to 0
        //for every index in col set
        //. if 0
        //  set everything in that col to 0
        int rowSet = -1;
        int colSet = -1;
                     
        for(int i = 0; i < matrix.length && rowSet == -1; i++){
            for(int j = 0; j < matrix[0].length && colSet == -1; j++){
                if(matrix[i][j] == 0){
                    rowSet = i;
                    colSet = j;                    
                }
            }
        }
        
        int stop = 0;

        if(rowSet == -1 || colSet == -1) {
            return;
        }
        
        for(int i = 0; i < matrix[0].length; i++){
            if(i != colSet && matrix[rowSet][i] != 0){
               matrix[rowSet][i] = -1; 
            }       
        }
        
        int stop2 = 0;
        
        for(int i = 0; i < matrix.length; i++){
            if(i != rowSet && matrix[i][colSet] != 0){
                matrix[i][colSet] = -1;
            }          
        }
        
        int stop3 = 0;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[rowSet][j] = 0;
                    matrix[i][colSet] = 0;
                }
            }
        }
        
        int stop4 = 0;
                              
        
        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[rowSet][i] == 0 && i != colSet) {
                for(int k = 0; k < matrix.length; k++){
                    if(i != colSet){
                       matrix[k][i] = 0; 
                    }
                    
                }
            }
            matrix[rowSet][i] = 0;
        }
        
        int stop5 = 0;
        
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][colSet] == 0 && i != rowSet) {
                for(int k = 0; k < matrix[0].length; k++){
                    matrix[i][k] = 0;
                }
            }
            matrix[i][colSet] = 0;
        }
        
        int stop6 = 0;
        
        return;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}