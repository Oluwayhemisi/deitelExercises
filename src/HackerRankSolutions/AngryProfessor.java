package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
    List<Integer> array = new ArrayList<>();
    array.add(-2);
    array.add(-1);
    array.add(0);
    array.add(1);
    array.add(2);
    System.out.println(checkStudentNumber(3,array));


    }

    public static String checkStudentNumber(int sNum, List<Integer> array){
        int arr =((int) array.stream().filter(x -> x <= 0).count());
        String result = (arr >= sNum ? "Yes": "No");
        return result;

    }
}
