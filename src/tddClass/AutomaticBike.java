package tddClass;

public class AutomaticBike {
    private boolean isOn;
    private int velocity;

    public void setOn(boolean on) {
        this.isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }


    public void accelerate() {
        if (velocity >= 0 && velocity <= 20) {velocity = velocity + 1;}
         else
        if (velocity >= 21 && velocity <= 30) {velocity = velocity + 2;}
        else
        if (velocity >= 31 && velocity <= 40) {velocity = velocity + 3;}
        else {velocity = velocity + 4; }
//        if (velocity < 0){velocity = 0;}
//        else if(velocity <= 20){velocity = velocity + 1;}
//        else if(velocity <= 30){velocity = velocity + 2;}
//        else if(velocity <= 40){velocity = velocity + 3;}
//        else if(velocity > 40){velocity = velocity + 4;}
    }

    public int getVelocity(){return velocity;}

    public void deccelarate() {
        if (velocity >= 0 && velocity <= 20) {velocity = velocity - 1;}

        if (velocity >= 21 && velocity <= 30) {velocity = velocity - 2;}


        if (velocity >= 31 && velocity <= 40) {velocity = velocity - 3;}

        if (velocity >= 41 && velocity <= 50) {velocity = velocity - 4; }

    }
}


