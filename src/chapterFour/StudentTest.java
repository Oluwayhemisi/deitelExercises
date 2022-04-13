package chapterFour;

public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Jane Green", 85.5);
        Student account2 = new Student("John blue", 60.0);

        System.out.printf("%s letter grade is:  %s%n", account1.getName(),account1.getLetterGrades());
        System.out.printf("%s letter grade is:  %s%n", account2.getName(),account2.getLetterGrades());

    }
}
