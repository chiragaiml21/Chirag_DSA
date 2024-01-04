package Arrays.Questions;

import java.util.Arrays;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr,3)));
    }
//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        int len = nums.length-k+1;
//        int[][] mat = new int[len][k];
//        int a =0 ;
//        int x = k;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = i; j < x; j++) {
//                mat[i][a]=nums[j];
//                a++;
//            }
//            x++;
//            a=0;
//        }
//        return maxVal(mat,len);
//
//    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length-k+1];
        int x = 0;
        for(int i=0; i<nums.length; i++){
            int[] temp = new int[k];
            while(i<k){
                temp[i] = nums[i];
                i++;
                k++;
            }
            int max = maxVal(temp, k);
            arr[x] = max;
            x++;
        }

    return arr;
    }
    static int maxVal(int[] arr,int len){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}