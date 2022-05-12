package chapterEight;

public enum People {
    JOY("Segun"),
    FOLAKE("Femi","Dami");


    private String[] boyFriendsName;

    People(String name){
        boyFriendsName = new String[1];
        boyFriendsName[0] = name;
    }
    People(String... name){
        boyFriendsName = name;
    }


    public void greetBoyFriend(){
        for(String boyFriend : boyFriendsName){
            System.out.print("hello"+ boyFriend);
        }

    }
    public String[] getBoyFriendsName(){
        return boyFriendsName;
    }

    public String toString(){
        switch (this){
            case JOY: return "Joy";
            case FOLAKE:return "folake";
            default:return null;
        }
    }
}
