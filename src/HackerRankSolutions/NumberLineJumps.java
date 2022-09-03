package HackerRankSolutions;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,2,5,3));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2){
        String result1 = "YES";
        String result2 = "NO";
        int multiplicator = 2;
        int sumOfFirstKangaroo = x1 + v1;
        int sumOfSecondKangaroo = x2 + v2;

        String finalResult = (sumOfFirstKangaroo * multiplicator == sumOfSecondKangaroo ? result1 : result2);
            return finalResult;

    }
}
