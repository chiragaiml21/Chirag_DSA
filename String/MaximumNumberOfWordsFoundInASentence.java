package Arrays.Sort;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInASentence {
    public static void main(String[] args) {
        String[] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(Count(str));
    }
    static int Count(String[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            String s = arr[i];
            String[] str = s.split(" ");
            if(count<str.length){
                count = str.length;
            }
        }
        return count;

    }
}
