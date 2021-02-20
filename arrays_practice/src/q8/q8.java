package q8;

import CTCILibrary.AssortedMethods;

import java.util.ArrayList;

public class q8 {

    public class Coords {
        int row;
        int col;

        public Coords(int r, int c){
            row = r;
            col = c;
        }
    }
    ArrayList<Coords> arrList = new ArrayList<Coords>();

    public q8(){
        int matrix[][] = {{1, 0, 3, 4},{5, 6, 7, 8},{9, 10, 11, 0},{13, 14, 15, 16}};
        AssortedMethods.printMatrix(matrix);
        zero(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);


    }

    public void zero(int[][] matrix){
        //find zeros
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0;j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    arrList.add(new Coords(i, j));
                }
            }
        }

        for(Coords cord: arrList){
            int r = cord.row;
            int c = cord.col;

            for(int i = 0; i < matrix.length; i++){
                matrix[i][c] = 0;
            }
            for(int i = 0; i < matrix.length; i++){
                matrix[r][i] = 0;
            }

        }


    }


}
