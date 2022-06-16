package abstraction;

public class ArrayList implements List {
    private int counter;
    private String[] db = new String[5];

    @Override
    public void add(String item) {

        if(counter < db.length){
            db[counter] = item;
            counter++;
        }
        else if(counter == db.length){
            expandArrayLength();
            db[counter] = item;
            counter++;
        }
    }

    @Override
    public void add(int index, String item) {
       if(counter < db.length){
           implementAdd(index,item);
       }
       else if(counter == db.length){
           expandArrayLength();
           implementAdd(index,item);
       }
      counter++;
    }


    @Override
    public String get(int index) {
        return db[index];
    }

    @Override
    public void remove(String item) {
        counter--;


    }

    @Override
    public void remove(int index) {
        counter--;

    }

    @Override
    public int size() {

        return counter;
    }
    public void expandArrayLength(){
        int newLength = db.length * 2;
        String[] db1 = new String[newLength];
        for(int i = 0; i < counter; i++) {
            db1[i] = db[i];
        }
        db = db1;

    }
    public void implementAdd(int index,String item){
        String[] db1 = new String[db.length];
        for (int i = 0; i < db.length; i++) {
            db1[i] = db[i];
        }
        db[index] = item;

        for (int i = index; i < db.length-1 ; i++) {
            db[i+1] = db1[i];
        }
    }


}