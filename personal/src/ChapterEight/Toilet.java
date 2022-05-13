package ChapterEight;

public class Toilet {
    private int showerStand;
    private int tap;
    private int waterCloset;
    private Door theDoor;

    public Toilet(int showerStand, int tap, int waterCloset) {
        this.showerStand = showerStand;
        this.tap = tap;
        this.waterCloset = waterCloset;
    }
    public void bathe(String type){
        System.out.println("Get in the "+type+ " and bathe.");

    }

    public int getShowerStand() {
        return showerStand;
    }

    public int getTap() {
        return tap;
    }

    public int getWaterCloset() {
        return waterCloset;
    }
}
