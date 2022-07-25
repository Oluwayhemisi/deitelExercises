package chapSixteen;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger findFactorial(int num) {
        BigInteger number = BigInteger.ONE;
        BigInteger first_Num = BigInteger.valueOf(num);
        BigInteger result = BigInteger.valueOf(1);
        while (!first_Num.equals(number)) {
             result = first_Num.multiply(first_Num).subtract(number);

        }
        return result;
    }

}