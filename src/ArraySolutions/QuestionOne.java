package ArraySolutions;

import java.util.Random;

public class QuestionOne {
    public static void main(String[] args) {
       StringBuilder build = new StringBuilder("");
       build.append("ade");
       build.append(" ");
       build.append("bisi");

        System.out.println(build);


        int a = 0;
        int b = 0;
        String val = "50";

        Random random = new Random();

        random.setSeed(System.currentTimeMillis());
        a = (random.nextInt(10000000));
        b = random.nextInt(100000000);
        System.out.println(val + a);
        System.out.println(val + b);

        System.out.println();

        random.setSeed(24);
        a = random.nextInt(10);
        b = random.nextInt(10);
        System.out.println(a);
        System.out.println(b);
    }
}
