package Arrays.Sort;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a"};
        String[] word2 = {"a", "bc"};
        System.out.println(check(word1, word2));
    }

    public static boolean check(String[] word1, String[] word2){
        String str1 = "";
        String str2 = "";

        for(int i=0; i<word1.length; i++){
            str1 += word1[i];
        }
        for(int i=0; i<word2.length; i++){
            str2 += word2[i];
        }

        boolean bool = true;

    if(str1.equals(str2)){
        return true;
    }else
        return false;
    }
}
