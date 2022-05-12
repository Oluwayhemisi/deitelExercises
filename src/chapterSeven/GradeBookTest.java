package chapterSeven;

public class GradeBookTest {

    public static void main(String[] args) {
        int [][] gradesArray = {{87,56,77},
                                {68,88,98},
                                {23,45,78}};
        GradeBook myGradebook = new GradeBook("CSC101 Introduction To Programming",gradesArray  );
        System.out.printf("%n%s%n%n",myGradebook.getCourseName());

        myGradebook.outputGrades();
        myGradebook.getMaximum();
        myGradebook.getMinimum();
//        myGradebook.getHigh()




    }
}
