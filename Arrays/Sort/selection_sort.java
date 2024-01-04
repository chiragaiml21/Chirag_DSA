package Arrays.Sort;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8,10,3};
        for(int i=0; i<arr.length-1; i++){
            int min = arr[i];
            int pos = i;
            for(int j=i+1; j<arr.length-1; j++){
                if(min>arr[j]){
                    min = arr[j];
                    pos = j;
                }
            }
        }

        for(int i:arr){
            System.out.print(i + " ");
        }

    }
}
