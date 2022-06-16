package chapterTen;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hours) {
        super(firstName, lastName, socialSecurityNumber);
        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("hours must be greater than 0.0 and less than 168.0");
        }
        this.hours = hours;
        if(wage < 0.0){
            throw  new IllegalArgumentException("wage cannot be less than 0.0");
        }
        this.wage = wage;


    }

    public void setWage() {
        if (wage < 0.0) {
            throw new IllegalArgumentException("wage cannot be less than 0.0");
        }
        this.wage = wage;
    }

    public void setHours() {
        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("hours must be greater than 0.0 and less than 168.0");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }
    @Override
    public double earning(){
        if(hours <= 40){
            return  getWage() * getHours();
        }
        else {
            return  40 * getWage() +(getHours() - 40) * getWage() * 1.5;
        }
    }
    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: %.2f; %s: %.2f, ",super.toString(),"hourly wage", getWage(),"hours worked",getHours());

    }
}
