package Arrays.Sort;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        String str = ")()())";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
