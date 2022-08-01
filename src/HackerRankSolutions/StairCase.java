package HackerRankSolutions;

public class StairCase {
    public static void main(String[] args) {
        System.out.println(stairs(6));
    }
    public static boolean stairs(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= i ; j++) {
                System.out.println("# ");

            }
            System.out.println();

        }
        System.out.println();
        return true;
    }
}
