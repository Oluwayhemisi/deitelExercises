package tdd;

public class WorldPopulation {

    private double worldPopulation;


    public void setFirstYear(double population, double rate, int year) {
        for (int i = 0; i < year; i++) {
            population = (population * rate) + population;
        }
        worldPopulation = population;

    }

    public double getPopulation() {
        return worldPopulation;
    }
}