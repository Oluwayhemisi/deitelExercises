package ChapterEight;

public class Kitchen {
    private String gasBurner;
    private int sink;
    private int table;
    private int tap;

    public Kitchen(String gasBurner, int sink, int table, int tap) {
        this.gasBurner = gasBurner;
        this.sink = sink;
        this.table = table;
        this.tap = tap;
    }
    public void cook(String food){
        System.out.println("prepare "+food+ ", i am hungry!");

    }

    public String getGasBurner() {
        return gasBurner;
    }

    public int getSink() {
        return sink;
    }

    public int getTable() {
        return table;
    }

    public int getTap() {
        return tap;
    }
}
