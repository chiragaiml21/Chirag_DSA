package Arrays.Questions;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        rotate(matrix);
    }
    public static void rotate(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] mat = new int[n][m];
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                mat[col][m-row-1] = matrix[row][col];
            }

        }
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                matrix[row][col] = mat[row][col];
            }
        }
        for(int row=0; row<m; row++){
            System.out.print(Arrays.toString(matrix[row]));
        }

    }
}
