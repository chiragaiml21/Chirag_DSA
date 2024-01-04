package Arrays.Search.Questions;

import java.util.Arrays;

public class RemoveduplicateElementsFromAnArray {

    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2,4,4,6,6};
        System.out.println(remove(nums));
    }
    public static int remove(int[] nums) {
        int k = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
