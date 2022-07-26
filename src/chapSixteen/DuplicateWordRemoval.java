package chapSixteen;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class DuplicateWordRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();
       String[] element = sentence.split(" ");
      List<String> stringList = Stream.of(element).sorted().distinct().toList();

        System.out.println(stringList);
    }
}
