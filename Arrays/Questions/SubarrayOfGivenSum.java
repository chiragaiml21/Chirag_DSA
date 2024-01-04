package Arrays.Questions;

import java.util.ArrayList;

public class SubarrayOfGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = 0;
        int s = 15;
//        System.out.println(check(arr, x));
        System.out.println(check(arr,x,s));
    }
    public static ArrayList<Integer> check(int[] arr, int x, int s){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = arr[x];
        list.add(arr[x]);
        for(int i=x+1; i<arr.length; i++){
            if(i==arr.length-1 && sum!=s){
                if(x!=arr.length-1 && sum!=s){
                    x = x+1;
                    list.clear();
                    check(arr,x,s);
                    break;
                }
                else{
                    System.out.println(-1);
                }
            }

            if(sum!=s){
                sum += arr[i];
                list.add(arr[i]);
            }
            else{list = index(list,arr);break;}
        }
        return list;
    }

    public static ArrayList<Integer> index(ArrayList<Integer> list, int[] arr){
        int start = list.get(0);
        int end = list.get(list.size()-1);

        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==start){
                lst.add(i);
            }
            else if(arr[i]==end){
                lst.add(i);
            }
        }

        return lst;
    }
}
