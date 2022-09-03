package HackerRankSolutions;

import java.util.List;

public class SubArrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {

        int numberOfWays=0;
        for(int j=0;j<=s.size()-m;j++){
            int sum=0;
            for (int i = j; i <j+m; i++) {
                sum+=s.get(i);
            }
            if (sum==d) {
                numberOfWays++;
            }

        }
        return numberOfWays;

    }

}

