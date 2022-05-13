package ChapterEight;

public class Door {
    private String type;
    private int length;
    private int size;

    public Door(String type, int length, int size) {
        this.type = type;
        this.length = length;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getSize() {
        return size;
    }
}
