package chapterSix;

public class HypotenuseCalculation {
    private double total = 0.0;
    private double hypotenuse = 0.0;

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double calculateHypotenuse(double firstNumber, double secondNumber){
        total = Math.pow(firstNumber,2) + Math.pow(secondNumber,2);

        hypotenuse = Math.sqrt(total);
        return hypotenuse;
    }

}
