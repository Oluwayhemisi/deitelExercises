package tdd;

import ChapterEight.Entries;

import java.util.ArrayList;
import java.util.Objects;

public class Diary {
    private String password;
    private ArrayList<Entries> entries;
    private int numberOfEntries;
    private boolean locked;
    private String userName;


    public Diary(String password) {
        this.password = password;

        entries = new ArrayList<>();
    }

    public void setPassword(String pin) {

            this.password = pin;

    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {

        return this.password;
    }

    public int checkNumberOfEntries() {
        return numberOfEntries;

         }


    public Entries createEntries(String title,String body,String password) {
        boolean isValid = getPassword().equals(password);
        if(!isValid){
            System.out.println("invalid password");
        }
        return new Entries(title, body);
    }

    public void addEntry(Entries entry){
        entries.add(entry);
        numberOfEntries+=1;
    }

    public String findEntry(int entryNumber) {
        int indexNum = entryNumber - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entries entry = entries.get(i);
            if (indexNum == i){
                return entry.getTheDate() + " | " + entry.getTitle() + " | " + entry.getBody();
            }
        }
        return "Entry " + entryNumber + " not found";
    }

    public boolean deleteEntry(int entryNumber) {
        int index = entryNumber - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entries entry = entries.get(i);
            if (Objects.equals(i, index)){
                entries.remove(entry);
                numberOfEntries -= 1;
                return true;
            }
        }
        return false;
    }


//    public void lockDiary(boolean lock) {
//        this.locked = lock;
//    }

    public boolean isLock(String password) {
        if(password == this.password){
            return !locked;
        }
        return locked;
    }
}
