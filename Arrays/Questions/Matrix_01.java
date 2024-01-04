package Arrays.Questions;

import java.util.Arrays;

public class Matrix_01 {
    public static void main(String[] args) {
        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        System.out.println(Arrays.toString(check(mat)));
    }
    public static int[] check(int[][] mat){

        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m*n];
        int count1 = 0;
        for(int i=0; i<m; i++){
            count1 = 0;
            for(int j=0; j<n; j++){
                if(j==n-1){
                    break;
                }
                else{
                    if(mat[i][j+1]!=0){
                        count1++;
                    }
                    else{
                        count1 = count1;
                        break;
                    }
                }
            }
            if(count1==count1){
                arr[i] = count1;
            }
        }

        return arr;

//        int count2 = 0;
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                if(i==m-1){
//                    break;
//                }
//                else{
//                    if(mat[i+1][j]!=0){
//                        count2++;
//                    }
//                    else{
//                        count2 = count2;
//                        break;
//                    }
//                }
//            }
//            if(count2==count2){
//                break;
//            }
//        }
//        if(count1<count2){
//            return count1;
//        }
//        else{
//            return count2;
//        }
    }
}
