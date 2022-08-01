package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {


    public static void main(String[] args) {
        List<Integer> sample = new ArrayList<>();
        sample.add(-4);
        sample.add(3);
        sample.add(-9);
        sample.add(0);
        sample.add(4);
        sample.add(1);
        plusMinus(sample);
    }
    public static void plusMinus(List<Integer> arr){
        int positive = (int) arr.stream().filter(x -> x > 0 ).count();
        double totalPositive = (positive *1.0)/arr.size();

        int zero = (int) arr.stream().filter(x -> x == 0).count();
        double totalZero = (zero * 1.0)/ arr.size();

        int negative = (int) arr.stream().filter(x -> x < 0).count();
        double totalNegative = (negative *1.0)/arr.size();

        System.out.printf("%.6f %n",totalPositive);
        System.out.printf("%.6f %n",totalNegative);
        System.out.printf("%.6f ",totalZero);


//        double[] result = new double[3];
//        result[0] = totalPositive;
//        result[1] = totalNegative;
//        result[2] = totalZero;


    }
}
