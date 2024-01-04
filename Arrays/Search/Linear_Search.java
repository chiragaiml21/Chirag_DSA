package Arrays.Search;//import java.util.Arrays;
import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,5,4,65,84,72,18,2,5,4,369,85};
        System.out.print("Enter the number to search in array : ");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr, target));
    }

    //Search the target and return the element
    //if item is not found it return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){      //if I want to print the element
            if(arr[i]==target)
                return i;
        }

        return -1;      //This statement runs if none of the above statement runs
    }

    //Search the target and return the index
//    static int linearSearch1(int[] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
//
//        for(int i=0; i<arr.length; i++){     //if I want to print the index of element
//            if(arr[i]==target){
//                return i;       //This statement runs if none of the above statement runs
//            }
//        }
//
//        return -1;
//    }
}
