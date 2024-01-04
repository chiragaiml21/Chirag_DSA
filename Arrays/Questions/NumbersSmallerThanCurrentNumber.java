package Arrays;
import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        int[] ans=smallerNumbersThanCurrent(nums);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[101];
        int[] temp = new int[101];
        int[] arr1 = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            arr[nums[i]] += 1;
            temp[nums[i]] += 1;
        }

        for(int i=0; i<arr.length; i++){
            if(i==0){
                arr[i] = arr[i];
            }
            else{
                arr[i] += arr[i-1];
            }
        }

        int count;
        for(int i=0; i<nums.length; i++){
            count = temp[nums[i]];
            if(count>1){
                arr1[i] = arr[nums[i]]-count;
            }
            else{
                arr1[i] = arr[nums[i]]-1;
            }
        }

        return arr1;
    }
}


