class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        List<Integer> result = new ArrayList<Integer>();        
        recurseSpiral(matrix, 0, matrix.length, matrix[0].length,  result);
        return result;
        
        
    }
    
    public void recurseSpiral(int[][] matrix, int startIdx, int m, int n,  List<Integer> result ){
            
        //for each element on top
        //. add to result
        //for each element on right side
        //  add to result
        //for each element on left
        //. add to result
        //recurse with inner matrix
        
        // int m = matrix.length;
        // int n = matrix[0].length;
        if(m < 1 || n < 1){
            return;
        }
        
        if(m == 1){
            for(int i = 0; i < n; i++){
                result.add(matrix[startIdx][startIdx + i]);
            }
            return;
        }        
        else if(n == 1){
            for(int i = 0; i < m; i++){
                result.add(matrix[startIdx+ i][startIdx]);
            }
            return;
        }
               
        for(int i = 0; i < n; i++){
            result.add(matrix[0 + startIdx][i + startIdx]);
        }
        for(int i = 1; i < m; i++){
            result.add(matrix[i+startIdx][n-1+startIdx]);
        }
        for(int i = n-2; i >= 0; i--){
            result.add(matrix[m-1+startIdx][i+startIdx]);
        }
        for(int i = m-2; i >= 1; i--){
            result.add(matrix[i+startIdx][0+startIdx]);
        }
        
        recurseSpiral(matrix, startIdx + 1, m - 2, n - 2, result);
        
    }
}





