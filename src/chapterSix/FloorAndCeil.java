package chapterSix;

public class FloorAndCeil {
    private double value = 0.0;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int myFloor(double num1){
        value = num1 - 0.5;
       return (int) value;
    }
    public int myCeil(double number1){
        value = number1 + 0.5;
        return (int) value;
    }


}
