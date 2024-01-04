package Arrays.Search.Questions;

import java.util.Arrays;

public class ThirdMaxElement {
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,3,5};
        int res = find_max(nums);
        System.out.println(res);
//        System.out.println(Arrays.toString(res));
    }
    static int find_max(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        int max = nums[0];
        for(int i: nums){
            if(i>max){
                max = i;
                count++;
            }
        }

        int[] arr = new int[count+1];
        arr[0] = nums[0];
        int k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                arr[k] = nums[i];
                k++;
            }
        }

        int ans;
        if(k>2){
            ans = arr[arr.length-3];
        }
        else{
            ans = arr[arr.length-1];
        }
        return ans;
    }
}
