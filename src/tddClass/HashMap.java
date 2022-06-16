package tddClass;

public class HashMap {
    private  ArrayList key = new ArrayList();
    private ArrayList value = new ArrayList();
    private int counter;

    public void put(String k, String v) {
        key.add(k);
        value.add(v);
        counter++;

    }
    public int getSize(){
        return counter;
    }

    public boolean containKeys(String k) {
        for (int i = 0; i < key.size(); i++) {
            if(k.equals(key.get(i))){
                return true;
            }

        }
        return false;

    }

    public boolean containValues(String v) {
        for (int i = 0; i < value.size(); i++) {
            if(v.equals(value.get(i))){
                return true;
            }

        }
        return false;

    }

}
