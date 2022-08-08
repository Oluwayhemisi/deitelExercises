package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class GradingStudent {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(73);
        array.add(67);
        array.add(38);
        array.add(33);

        System.out.println(gradingStudents(array));
    }

    public static List<Integer> gradingStudents(List<Integer> grades){
        List<Integer> finalGrade = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int nextNumber = 0;
            int studentGrade = grades.get(i);
            if(grades.get(i) >= 38){
               while (studentGrade > nextNumber){
                   nextNumber += 5;
               }
               int multiSubtraction = nextNumber - studentGrade;
              if(multiSubtraction > 0 && multiSubtraction < 3 ){
                   studentGrade = nextNumber;
                   finalGrade.add(studentGrade);
              }
              else{
                  int numberNotUpToThree = grades.get(i);
                  finalGrade.add(numberNotUpToThree);
              }
            }
            else {
                int numberLessThanAverage = grades.get(i);
                finalGrade.add(numberLessThanAverage);
            }
        }
        return finalGrade;
    }
}
