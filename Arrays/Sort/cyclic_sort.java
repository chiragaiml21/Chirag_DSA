package Arrays.Sort;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first, int second){
        arr[first] ^= arr[second];
        arr[second] ^= arr[first];
        arr[first] ^= arr[second];

    }


}
