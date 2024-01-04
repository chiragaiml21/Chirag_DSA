package Arrays.Matrix;

public class Search {
    public static void main(String[] args) {
        int[][] mat= {
            {1,2,5,9},
            {5,4,6,91},
            {85,11,23,66}
        };
        int target = 91;

        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[0].length; col++){
                if(mat[row][col]==target){
                    System.out.println(true);
                }
            }
        }
    }
}
