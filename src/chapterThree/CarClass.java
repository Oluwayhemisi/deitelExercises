package chapterThree;

public class CarClass {
    private String model;
    private String year;
    private double price;
    private double priceDiscount;


    public CarClass(String model, String year, double price,double priceDiscount)
    {  this.model = model;
        this.year = year;
        this.price = price;
    this.priceDiscount = priceDiscount;}


    public void setModel(String model){this.model= model;}
    public String getModel()
    {return model;}

    public void setYear(String year){this.year = year;}
    public String getYear()
    {return year;}



    public void setPrice(double price){this.price = price;}
    public double getPrice()
    {return price;}


    public double getPriceDiscount()
    {return price - (price * priceDiscount); }
}
