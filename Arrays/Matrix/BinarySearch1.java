package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

//When matrix is sorted by both row and column
public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int[][] mat = new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int target = 3;
        System.out.println(Arrays.toString((search(mat, target))));
    }
    public static int[] search(int[][] mat, int target){
        int r = 0;
        int c = mat.length-1;

        while(r<mat.length && c>=0){
            if(mat[r][c]==target){
                return new int[] {r,c};
            }

            if(mat[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
