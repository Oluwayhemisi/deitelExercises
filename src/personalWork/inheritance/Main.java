package personalWork.inheritance;

public class Main {
    public static void main(String[] args) {
        Pray pray = new Pray();
        Walk walk = new Walk();
        Pray1 pray1 = new Pray1();
        Pray2 pray2 = new Pray2();
        PapaNosa nosa = new PapaNosa(pray,walk);

        nosa.pray();

        nosa.setPray(pray1);
        nosa.pray();

        nosa.setPray(pray2);
        nosa.pray();



    }
}
