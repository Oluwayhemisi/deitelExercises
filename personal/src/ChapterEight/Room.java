package ChapterEight;

public class Room {
    private int fan;
    private int light;
    private int window;
    private Furniture TheFurniture;

    public Room(int fan, int light, int window, Furniture theFurniture) {
        this.fan = fan;
        this.light = light;
        this.window = window;
        TheFurniture = theFurniture;
    }
    public void sleep(String mattress){
        System.out.println("lay down on the "+mattress+ " and sleep");
    }

    public int getFan() {
        return fan;
    }

    public int getLight() {
        return light;
    }

    public int getWindow() {
        return window;
    }

    public Furniture getTheFurniture() {
        return TheFurniture;
    }
}
