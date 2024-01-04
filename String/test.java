package Arrays.Sort;
import java.lang.String;

public class test {
    public static void main(String[] args) {
        String in = "Apples";
        StringBuilder in2 = new StringBuilder();
        for(int i=0;i<in.length();i++){
            if(in.charAt(i) == 'A'){
                in2.append("P");
            }
            else if(in.charAt(i) == 'p'){
                in2.append("a");
            }
            else{
                in2.append(in.charAt(i));
            }
        }
        System.out.println(in2);
    }
}