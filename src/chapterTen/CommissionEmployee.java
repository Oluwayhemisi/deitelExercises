package chapterTen;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        if(commissionRate < 0.0){
            throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0" );
        }

        if( grossSales < 0.0){
            throw new IllegalArgumentException( "gross sale must be > 0.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0){
            throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0" );
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if( grossSales < 0.0){
            throw new IllegalArgumentException( "gross sale must be > 0.0");
        }
        this.grossSales = grossSales;
    }
    @Override
    public double earning(){
        return getCommissionRate() * getGrossSales();
    }
    @Override
    public  String toString(){
        return  String.format("%s: %s%n %s: %.2f%n%s: %.2f","commission employee",super.toString(),"gross sales",getGrossSales(),"commission rate",getCommissionRate());
    }
}
