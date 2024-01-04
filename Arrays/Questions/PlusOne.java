package Arrays.Questions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {9,9,9,9};
        System.out.println(Arrays.toString(plus(nums)));
    }
    static int[] plus(int[] nums){
        int[] arr1 = new int[nums.length+1];

        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = nums[i-1];
        }

        for(int i=arr1.length-1; i>=0; i--){
            if(arr1[i]==9){
                arr1[i]=0;
            }
            else{
                arr1[i]++;
                break;
            }
        }
        int count=0;
        for(int i:arr1){
            count++;
        }
        if(arr1[0]==0)
            count--;
        else
            count = count;

        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++){
            if(arr1[0]==0){
                arr[i] = arr1[i+1];
            }
            else{
                arr[i] = arr1[i];
            }
        }
        return arr;
    }
}
