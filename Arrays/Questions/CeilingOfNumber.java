package Arrays.Search.Questions;

import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println("Enter the target number : ");
        int target = sc.nextInt();
        System.out.println(ceilingofnum(arr, target));
    }
    public static int ceilingofnum(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return start;
    }
}
