package tddClass;


public class AirCondition {

    private boolean on;
    private int temperature = 16;

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }


    public void increaseTemp() {
        if (temperature >= 16 && temperature < 30)
        {
            temperature = temperature + 1;
        }
        if (temperature > 30)
        {
            temperature = 30;
        }

    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemp() {
        if (temperature > 16 && temperature < 30) {
            temperature = temperature - 1;
        }
        if (temperature == 16) {
            temperature = 16;
        }
        if (temperature < 16) {
            temperature = 16;
        }
    }

    }




