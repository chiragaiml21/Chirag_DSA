package Arrays.Questions;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2,  n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] arr = new int[m+n];
//        for(int i=0; i<nums1.length; i++){
//            arr[i] = nums1[i];
//        }
//        int x = 0;
//        for(int i=0; i<nums1.length; i++){
//            if(nums1.length==0){
//                break;
//            }
//            else if(arr[i]!=0 && (arr[i]<=nums2[x] || arr[i]<nums2[x])){
//                nums1[i] = arr[i];
//            }
//            else{
//                nums1[i] = nums2[x];
//                x++;
//                if(i==nums1.length-1){
//                    break;
//                }
//                else{
//                    arr[i+1] = arr[i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums1));

        int x = m;
        for(int j=0; j<n; j++){
            nums1[m] = nums2[j];
            x++;
        }
        Arrays.sort(nums1);

    }
}
