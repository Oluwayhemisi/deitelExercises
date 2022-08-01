package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCandles {


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        System.out.println(birthdayCandleList(numbers));
    }
    public static int birthdayCandleList(List<Integer> array){
        int max = array.stream().mapToInt(x-> x).max()
                .getAsInt();

        int result = (int) array.stream().filter(x -> x==max).count();
        return result;


    }
}
