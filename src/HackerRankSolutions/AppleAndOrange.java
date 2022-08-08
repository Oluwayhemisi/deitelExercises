package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        apples.add(2);
        apples.add(3);
        apples.add(-4);
        List<Integer> oranges = new ArrayList<>();
        oranges.add(3);
        oranges.add(-2);
        oranges.add(-4);
        countApplesAndOranges(7,10,4,12,apples,oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){


        int appleResult = (int) apples.stream().map(x-> x + a).filter(x-> x >=s && x <= b).count();
        int orangeResult = (int) oranges.stream().map(x-> x + b).filter(x-> x >=s && x <= b).count();

        System.out.println(appleResult);
        System.out.println(orangeResult);






    }
    }

