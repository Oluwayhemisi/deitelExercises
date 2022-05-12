package chapterSeven;

public class GradeBook {
    private String courseName;
    private int[][] grades;
    private int highGrade;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaximum() {
         highGrade = grades[0][0];
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {

                    highGrade = grade;
                }
            }
//            System.out.println("The highest grade is "+highGrade);
        }
        return highGrade;

    }

    public int getMinimum() {
        int lowGrade = grades[0][0];
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }
    public double getAverage(int[] setOfGrades){
        int total =  0;
        for(int grade : setOfGrades){
            total += grade;
        }
        return (double) total /setOfGrades.length;
    }


    public void outputGrades(){
        System.out.printf("the grades are: %n%n");
        repeat();
        System.out.print("subject:  ");

        for (int subject = 0; subject < grades[0].length; subject++) {
            System.out.printf("Subject %d ",subject + 1);

        }
        System.out.println("average");
        repeat();
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d",student + 1);
            for (int subject : grades[student]) {
                System.out.printf("%9d", subject);
            }
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
    public void repeat(){
        String shape = "=";
        System.out.print(shape.repeat(70));
        System.out.println();

    }

}
