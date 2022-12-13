package ArraySolutions;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static String mathChallenge(int num){
        List<Integer> get = new ArrayList<>();
        int number = 0;
        int numberTwo = 1;
        int sum = 0;
        while (numberTwo <= num){
            get.add(number);
            sum = number + numberTwo;
            number = numberTwo;
            numberTwo = sum;

        }
        if (get.contains(num)){
            return "yes";
        }
        else return "no";



    }

    public static void main(String[] args) {
        System.out.println(mathChallenge(34));
    }
}
