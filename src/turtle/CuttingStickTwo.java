package turtle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CuttingStickTwo {
    public  static List<Integer> cutTheSticks(List<Integer> arr){
        List<Integer> result = new ArrayList<>();
        Collections.sort(arr);
        int min = arr.get(0);
        result.add(min);

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > min){
                min = arr.get(i);
            }
            result.add(arr.size() - i);

        }
        return result;
    }
}
