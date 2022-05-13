package ChapterEight;

public class Furniture {
   private int wardrobe;
   private int bed;
   private int table;

    public Furniture(int wardrobe, int bed, int table) {
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.table = table;
    }

    public int getWardrobe() {
        return wardrobe;
    }

    public int getBed() {
        return bed;
    }

    public int getTable() {
        return table;
    }
}
