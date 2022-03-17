package chapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol,int quantity,
    double pricePerLitre, double percentageDiscount){
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public void setLocation(String stationLocation)
    {this.stationLocation = stationLocation;}

    public String getStationLocation()
    {return stationLocation;}

    public void setTypeOfPetrol(String typeOfPetrol)
    {this.typeOfPetrol = typeOfPetrol;}

    public String getTypeOfPetrol()
    {return typeOfPetrol;}

    public void setQuantity(int quantity)
    {this.quantity = quantity;}

    public int getQuantity()
    {return quantity;}

    public void setPricePerLitre(double pricePerLitre)
    { this.pricePerLitre = pricePerLitre;}

    public double getPricePerLitre()
    {return pricePerLitre;}

    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount()
    {return percentageDiscount;}

    public double getPurchase()
    { return (quantity * pricePerLitre)  - percentageDiscount;}



    }
