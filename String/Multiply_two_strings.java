package Arrays.Sort;

import java.math.BigInteger;

public class Multiply_two_strings {
    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "840477629533";
        System.out.println(new String(String.valueOf(new BigInteger(num1).multiply(new BigInteger(num2)))));
    }
}
