package Arrays.Search;//Steps:
//1. Find the middle element of the array
//2. if target>mid ==> search in right
//3. if mid==target ==> answer



//import java.util.Arrays;
import java.util.Scanner;

//*** Binary Search only works on sorted arrays ***
//But how to know that the array is in ascending order or in descending order (Order-Agnostic)
//if start<end ==> Ascending
//if start>end ==> Descending
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,12,17,56,84};
        System.out.print("Enter the number to search in array : ");
        int target = sc.nextInt();

        System.out.println(binarySearch(arr, target));

    }

    //return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];   //Finding if the array is in ascending or descending //If asc it returns true



        while(start <= end){
            //find the middle element
//            int mid = (start+end)/2;   //might be possible that start+end exceeds the range of int

            int mid = start + (end - start) / 2;

            if(arr[mid]==target){
                return mid;
            }

            //If the array is in ascending order
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }
            }
            //If the array is in descending order
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else if(target < arr[mid]){
                    start = mid+1;
                }
            }
        }
        //This statement runs if none of the above statement runs
        return -1;
    }
}