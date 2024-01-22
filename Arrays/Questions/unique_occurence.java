package Arrays.Questions;
import java.util.Arrays;
import java.util.HashSet;

public class unique_occurence {
    public static Boolean uniqueOccurrences(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }

        int[] arr1 = new int[max+1];
        int[] arr2 = new int[Math.abs(min)+1];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                arr1[arr[i]]++;
            }
            else{
                arr2[Math.abs(arr[i])]++;
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            if(set.contains(arr1[i])) return false;
            if(arr1[i]!=0) set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])) return false;
            if(arr2[i]!=0) set.add(arr2[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
