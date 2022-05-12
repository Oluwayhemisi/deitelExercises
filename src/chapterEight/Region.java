package chapterEight;

public enum Region {
    NE("Ajekunle", "Ikeja","Abuja"),
    SE("VI","BI"),
    SW("Mushin","okoko","ketu"),
    NC("ibadan","Ekiti"),
    NW("Sabo","Bariga","Somolu"),
    SS("challenge","Molete","Mowe");

    private String[] states;
    Region(String... states){
        this.states =states;
    }
}
