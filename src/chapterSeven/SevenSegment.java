package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSegment {
    static String[][] sevenSegment = new String[5][4];
    static Scanner input = new Scanner(System.in);

    public static void setElementA() {
        for (int row = 0; row <= 0; row++) {
            for (int column = 0; column <= 3; column++) {
                sevenSegment[row][column] = "#";
            }
        }
    }

    public static void setElementB() {
        for (int row = 0; row <= 2; row++) {
            for (int column = 3; column <=3; column++) {
                sevenSegment[row][column] = "#";
            }
        }
    }

    public static void setElementC() {
        for (int row = 2; row <= 4; row++) {
            for (int column = 3; column <= 3; column++) {
                sevenSegment[row][column] = "#";
            }
        }
    }

    public static void setElementD() {
        for (int row = 4; row <= 4; row++) {
            for (int column = 0; column <= 3; column++) {
                sevenSegment[row][column] = "#";
            }
        }
    }

    public static void setElementE() {

        for (int row = 2; row <= 4; row++) {
            for (int column = 0; column <= 0; column++) {
                sevenSegment[row][column] = "#";
            }
        }
    }

    public static void setElementF() {
        for (int row = 0; row <= 2; row++) {
            for (int column = 0; column <= 0; column++) {
                sevenSegment[row][column] = "#";
            }
        }
    }

    public static void setElementG() {
        for (int row = 2; row <= 2; row++) {
            for (int column = 0; column <= 3; column++) {
                sevenSegment[row][column] = "#";
            }
        }
    }

    public static void setAllElement() {
        setElementA();
        setElementB();
        setElementC();
        setElementD();
        setElementE();
        setElementF();
        setElementG();
    }

    public static void setDisplaySegment(String binary) {
        for (String[] strings : sevenSegment) {
            Arrays.fill(strings, " ");
        }

        if (binary.length() == 8) {
            if (binary.charAt(7) == '1') {
                if (binary.charAt(0) == '1') {
                    setElementA();
                }
                if (binary.charAt(1) == '1') {
                    setElementB();
                }

                if (binary.charAt(2) == '1') {
                    setElementC();
                }
                if (binary.charAt(3) == '1') {
                    setElementD();
                }
                if (binary.charAt(4) == '1') {
                    setElementE();
                }
                if (binary.charAt(5) == '1') {
                    setElementF();
                }
                if (binary.charAt(6) == '1') {
                    setElementG();
                }
            }

        }
        else{
            System.out.print("wrong input!");
        }
    }

    public static void display(){
        for (int i = 0; i < sevenSegment.length; i++) {
            for (int j = 0; j < sevenSegment[i].length; j++) {
                System.out.print(sevenSegment[i][j]+" ");

            }
            System.out.println();
        }
    }


}