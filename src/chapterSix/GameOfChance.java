package chapterSix;

import java.security.SecureRandom;

public class GameOfChance {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int die1 = secureRandom.nextInt(1, 7);
        int die2 = secureRandom.nextInt(1, 7);
        int points;
        int sum = die1 + die2;

        if ((sum == 7) || (sum == 11)) {
            System.out.println(sum);
            System.out.println("you win");
        } else if ((sum == 2) || (sum == 3) || (sum == 12)) {
            System.out.println(sum);
            System.out.println("you lose");
        } else if ((sum == 4) || (sum == 5) || (sum == 6) || (sum == 8) || (sum == 9) || (sum == 10)) {
            points = sum;
            System.out.println(points);
            for (int i = 0; i < 1000000; i++) {
                die1 = secureRandom.nextInt(1, 7);
                die2 = secureRandom.nextInt(1, 7);
                int sumPoints = die1 + die2;
                if (sumPoints == points) {
                    System.out.println(sumPoints);
                    System.out.println("you win");
                    break;
                } else if (sumPoints == 7) {
                    System.out.println(sumPoints);
                    System.out.println("you lose");
                    break;
                }
                System.out.println(sumPoints);
            }

        }

    }
}
