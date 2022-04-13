package chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
            for (int row1 = 1; row1 <= 10; row1++) {
                for (int column1 = 1; column1 <= row1; column1++) {
                    System.out.print("  ");
                }
                for (int column1 = 10; column1 >= row1; column1--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        System.out.println();
        for (int row = 1; row <=10 ; row++) {
            for (int column = 1; column <= 10 - row ; column++) {
                System.out.print("  ");

            }
            for (int column = 1; column <= row ; column++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= 10 ; row++) {
            for (int column = 10; column >= row; column--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        }
        }



