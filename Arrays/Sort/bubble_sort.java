package Arrays.Sort;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    arr[j] ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j] ^= arr[j+1];
                }
            }
        }

        for(int i:arr){
            System.out.print(i + " ");
        }

    }
}
