package q7;
import CTCILibrary.AssortedMethods;

public class q7 {

    public q7(){

            //int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
        int matrix[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
            AssortedMethods.printMatrix(matrix);
            rotate(matrix, 0);
            System.out.println();
            AssortedMethods.printMatrix(matrix);




    }

    public void rotate(int[][] matrix, int shrink){
        int colCount = matrix[0].length;
        int rowCount = colCount;
        if(shrink == rowCount / 2){
            return;
        }
        for(int col = shrink; col < colCount-shrink- 1; col++){
            int row = shrink;
            int top     = matrix[row][col];
            int left    = matrix[rowCount-col-1][row];
            int bottom  = matrix[rowCount-row-1][rowCount-col-1];
            int right   = matrix[col][rowCount-row-1];

            matrix[row][col] = right;
            matrix[rowCount-col-1][row] = top;
            matrix[rowCount-row-1][rowCount-col-1] = left;
            matrix[col][rowCount-row-1] = bottom;
        }
        rotate(matrix, shrink+1);

    }


}
