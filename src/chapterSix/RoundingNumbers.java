package chapterSix;

public class RoundingNumbers {
    private double num = 0.0;
    private int result;
    private double initialNumber = 0.0;



    public static void main(String[] args) {

    }

    public double setNearestNumber(double number1) {
         num = Math.floor(number1);
          initialNumber = number1;
         return num;
    }


    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
     public double getInitialNumber(){
        return initialNumber;
     }

    public int setNearestInteger(double number ) {
        num= (int) Math.floor(number + 0.5);
        return (int) num;
    }


    public int roundToTenth(double tenthNumber) {

       num = Math.floor(tenthNumber * 10 + 0.5) / 10;

       return(int) num ;
    }

    public int getResult() {
        return result;
    }
}
