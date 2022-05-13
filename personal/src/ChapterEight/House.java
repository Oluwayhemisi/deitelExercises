package ChapterEight;

public class House {
    private Room theroom;
    private Toilet theToilet;
    private Kitchen theKitchen;

    public House(Room theroom, Toilet theToilet, Kitchen theKitchen) {
        this.theroom = theroom;
        this.theToilet = theToilet;
        this.theKitchen = theKitchen;
    }


public void houseActivities(){
        theKitchen.cook("Rice and stew");
        bathe();
        rest();
}
public void bathe(){
        theToilet.bathe("Shower");
}
   public void rest(){
        theroom.sleep("water bed");
   }
}
