package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {

        List<Integer> res=new ArrayList<>();

        int count_min=0;
        int count_max=0;
        int minimun=scores.get(0);

        int maximun=scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i)>maximun) {
                maximun=scores.get(i);
                count_max++;
            }else if (scores.get(i)<minimun) {
                minimun=scores.get(i);
                count_min++;
            }
            else{
                continue;
            }
        }
        res.add(count_max);
        res.add(count_min);

        return res;
    }


}


