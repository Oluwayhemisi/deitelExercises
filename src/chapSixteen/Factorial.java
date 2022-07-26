package chapSixteen;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
        System.out.println(IntStream.rangeClosed(1,20).map(e -> e * 2).sum());
        System.out.println(IntStream.rangeClosed(1,20).filter(e -> e % 2 == 0).sum());
    }
    public static BigInteger findFactorial(int num) {
        BigInteger first_Num = BigInteger.valueOf(num);
        BigInteger result = BigInteger.valueOf(1);
        while (!first_Num.equals(BigInteger.ONE)) {
             result = result.multiply(first_Num);
             first_Num = first_Num.subtract(BigInteger.ONE);
        }
        return result;
    }
//    public static void printFact(int num){
//        System.out.print(findFactorial(num));
//    }



}