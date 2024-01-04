package Arrays.Matrix;

import java.util.Arrays;

//When Array is completely sorted
public class BinarySearch2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    public static int[] search(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid / n][mid % n];

            if (mid_val == target)
                return new int[] {mid/n, mid%n};
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return new int[] {-1,-1};
    }
}
