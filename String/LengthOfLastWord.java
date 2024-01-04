package Arrays.Sort;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(find_length(str));
    }
    public static int find_length(String str){
        String[] arr = str.split(" ");
        str = arr[arr.length-1];
        int len = str.length();

        return len;
    }
}
