package chapterFour;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average){
        this.name = name;

        if (average > 0.0){
            if (average <= 100){
                this.average = average;
            }
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }
    public String getLetterGrades() {
        String letterGrades = "";
        if (average >= 90.0) {
            letterGrades = "A";
        } else if (average >= 80.0) {
            letterGrades = "B";
        } else if (average >= 70.0) {
            letterGrades = "C";
        } else if (average >= 60.0) {
            letterGrades = "D";
        } else {
            letterGrades = "F";
        }
        return letterGrades;
    }
}
