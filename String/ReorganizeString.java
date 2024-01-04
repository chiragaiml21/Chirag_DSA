package Arrays.Sort;

import java.util.HashMap;

public class ReorganizeString {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(reorganizeString(s));
    }
    public static String reorganizeString(String s) {
        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        int max = 0, letter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                letter = i;
            }
        }
        if(max>(s.length()+1)/2){
            return "";
        }

        char[] res = new char[s.length()];
        int idx = 0;
        while(arr[letter]>0){
            res[idx] = (char) (letter + 'a');
            idx += 2;
            arr[letter]--;
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                if (idx >= res.length) {
                    idx = 1;
                }
                res[idx] = (char) (i + 'a');
                idx += 2;
                arr[i]--;
            }
        }
        return new String(res);
    }
}
