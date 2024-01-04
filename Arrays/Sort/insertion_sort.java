package Arrays.Sort;

public class insertion_sort {
    public static void main(String[] args) {

        int[] arr = {15,5,4,18,12,19,14,10,8,20};
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int i:arr){
            System.out.print(i + " ");
        }

    }
}
