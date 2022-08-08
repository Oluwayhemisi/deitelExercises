package HackerRankSolutions;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2){
        String result1 = "YES";
        String result2 = "NO";
        int sumOfFirstKangaroo = x1 + v1;
        int sumOfSecondKangaroo = x2 + v2;

        String finalResult = (sumOfSecondKangaroo % sumOfFirstKangaroo == 0 ? result1 : result2);
            return finalResult;

    }
}
