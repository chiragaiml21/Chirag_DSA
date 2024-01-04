package Arrays.Sort;

public class abc {
    public static void main(String[] args) {
        String a = "0261", b = "3";
        String res = "";
        int x = 0, y = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='0'){
                res+=a.charAt(i);
            }
            else{
                x = (x*10) + Integer.parseInt(String.valueOf(a.charAt(i)));
            }
        }
        for(int i=0; i<b.length(); i++){
            if(a.charAt(i)!=0){
                y = (y*10) + Integer.parseInt(String.valueOf(b.charAt(i)));
            }
        }
        System.out.println(res + new String(String.valueOf(x*y)));

    }
}
