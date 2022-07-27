package chapSixteen;

import java.security.SecureRandom;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        IntStream stream = secureRandom.ints(10,0,10001);

        List<Integer> list = stream.boxed().toList();
        System.out.println(list);

        Long evenCount = list.stream()
                .filter(x -> x % 2 == 0)
                .count();
        Long oddCount = list.stream().filter(x -> x % 2 == 1)
                .count();

        double evenAverage = (list.stream().filter(x -> x % 2 == 0 ).reduce(0,Integer::sum) * 1.0)/evenCount;

        double oddAverage = (list.stream().filter(x -> x % 2 == 0 ).reduce(0,Integer::sum) * 1.0)/oddCount;

        double average = (list.stream().reduce(0,Integer::sum) * 1.0)/ list.size();
        IntPredicate greaterThan5 = x -> x > 5;
        int[] values = {1,-2,4,5,12,-23,45};
        List<Integer> list1 = IntStream.of(values).filter(greaterThan5).boxed().toList();
        System.out.println(list1);

        System.out.println("Even count "+ evenCount);
        System.out.println("Odd count "+ oddCount);
        System.out.println("Odd average "+ oddAverage);
        System.out.println("Even average "+ evenCount);
        System.out.println("Average "+average);
    }

}
