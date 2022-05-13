package tdd;

public class BodyMaxIndex {
    private int weight;
    private int height;
    public String bodyMax;


    public void setUnderWeight(double weight) {
        if (weight > 0.0 && weight < 18.5) {
            bodyMax = "underWeight";
        }
    }


    public String getWeight() {

        return bodyMax;
    }


    public void setHealthyTest(double weight) {
        if (weight >= 18.5 && weight <= 24.9) {
            bodyMax = "Healthy";
        }
    }

    public void setOverWeightTest(double weight) {
        if (weight >= 25.0 && weight <= 29.9) {
            bodyMax = "OverWeight";

        }
    }

    public void setObessedTest(double weight) {
        if(weight >= 30.0){
            bodyMax = "Obessed";
        }
    }
}