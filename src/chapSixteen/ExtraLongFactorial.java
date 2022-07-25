package chapSixteen;

import java.math.BigInteger;

public class ExtraLongFactorial {
    public static void printFact(int n){
        System.out.println(fact(n));
    }
    private static BigInteger fact(int n) {
       BigInteger result = new BigInteger(String.valueOf(n));
       if(n == 1){
           return result;
       }
       else{
           return result.multiply(fact(n-1));
       }
    }

    public static void main(String[] args) {

        System.out.println(fact(5));
    }
}
