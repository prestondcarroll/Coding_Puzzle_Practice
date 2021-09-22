class Solution {
    public void rotate(int[][] matrix) {
        
        //loop until every element is done
        //. store element of far right col
        //. move top row left to far right col
        //
        //. store element of bottom row in separate var
        //. place prev Stored in bottom row
        //. prev store = new store
        //
        //. new stored element of left col
        //. place prevStored element in left col
        //. prevStore = new store
        //
        //. place prevStored in top row
        
        
        // recurse inner matrix
        recurseRotate(0, matrix.length, matrix);
        return;
        
        
    }
    
    public void recurseRotate(int si, int n, int[][] matrix){
        
        if(n <= 1){
            return;
        }
        
        for(int i = 0; i < n - 1; i++){
            int prevStore = matrix[0 + si][i + si];
            int newStore = matrix[i + si][n-1+si];
            matrix[i + si][n- 1 + si] = prevStore;
            prevStore = newStore;
            
            newStore = matrix[n-1+si][n-1-i+si];
            matrix[n-1+si][n-1-i+si] = prevStore;
            prevStore = newStore;
            
            newStore = matrix[n-1-i+si][0+si];
            matrix[n-1-i+si][0+si] = prevStore;
            prevStore = newStore;
            
            matrix[0+si][i+si] = prevStore;
        }
        
     recurseRotate(si + 1, n - 2, matrix);   
        
    }
    
    
    
    
    
    
    
}

























