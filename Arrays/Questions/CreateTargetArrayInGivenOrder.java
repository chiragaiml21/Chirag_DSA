package Arrays.Questions;

import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[nums.length];
        int k = 0;
        for(int i:index){
            arr[i] = nums[k];
            k++;
        }

        return arr;
    }
}
