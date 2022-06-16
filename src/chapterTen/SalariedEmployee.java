package chapterTen;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("salary cannot be less than 0.0");
        }
        this.weeklySalary = weeklySalary;
    }
    public void setWeeklySalary(){
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("salary cannot be less than 0.0");
        }
        this.weeklySalary = weeklySalary;

    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
    @Override
    public double earning(){
        return getWeeklySalary();
    }
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: %.2f",super.toString(),getWeeklySalary());
    }
}
