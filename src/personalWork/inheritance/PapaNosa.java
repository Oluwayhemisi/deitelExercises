package personalWork.inheritance;

public class PapaNosa {
    private Pray pray;
    private Walk walk;

    public PapaNosa(Pray pray, Walk walk) {
        this.pray = pray;
        this.walk = walk;
    }

    public void pray(){
        this.pray.pray();

    }

    public void setPray(Pray pray){
        this.pray = pray;
    }
    public void walk(){

    }
    public void setWalk(Walk walk){
        this.walk = walk;
    }
}
