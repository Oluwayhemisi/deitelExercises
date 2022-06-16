package tddClass;

public class Set {

    ArrayList set;

    public Set() {
        set = new ArrayList();
    }

    public void addItem(String item) {
        set.add(item);
    }

    public int size() {

        return set.size();
    }
    public boolean contains(String item){
        for (int i = 0; i < set.size(); i++) {
            if(item.equals(set.get(i))){
                item = null;
                return true;
            }
        }
       return false;
    }

    public void removeItem(String item) {
        set.remove(item);
    }

    public ArrayList getArrayList(){
        return set;
    }
}
