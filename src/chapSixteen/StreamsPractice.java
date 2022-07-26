package chapSixteen;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractice {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,20).map(e -> e * 2).sum());
        System.out.println(IntStream.rangeClosed(1,20).filter(e -> e % 2 == 0).sum());
        int product = IntStream.rangeClosed(1,5).reduce((acc,el) -> acc * el).getAsInt();
        int product2 = IntStream.rangeClosed(1,5).reduce(1,(acc,el) -> acc * el);
        System.out.println(product);

        int tripple = IntStream.rangeClosed(1,20).filter(x -> x % 2 != 0).map(x -> x * x).sum();
        System.out.println(tripple);

        SecureRandom secureRandom = new SecureRandom();
        secureRandom.ints(10,1,7).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
        String result = secureRandom.ints(20,1,14).mapToObj(String::valueOf).collect(Collectors.joining(" "));

    }

}
