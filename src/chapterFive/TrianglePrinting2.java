package chapterFive;

public class TrianglePrinting2 {
    public static void main(String[] args) {
        for(int row =1; row <=10; row++){
            for(int column = 1; column<=row; column++){
                System.out.print("x ");
            }
            for(int column = 10; column >=row; column--){
                System.out.print("  ");
            }
            for(int column = 10; column >=row; column--){
                System.out.print("x ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print("  ");
            }
            for(int column = 1; column<=row; column++){
                System.out.print("  ");
            }
            for(int column = 10; column >=row; column--){
                System.out.print("x ");
            }
            for(int column = 10; column >=row; column--){
                System.out.print("  ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print("x ");
            }
            System.out.println();

        }
    }
}
