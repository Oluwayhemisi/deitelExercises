package Diarypackage.model;

import chapterEight.Entry;

import java.util.ArrayList;
import java.util.Objects;

public class DiaryForUsers {
    private String password;
    private ArrayList<Entry> entries;
    private String userName;
    private boolean isLocked;

    public DiaryForUsers(String password, String userName) {
        this.password = password;
        this.userName = userName;
        entries = new ArrayList<>();

    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public Entry createEntry(String title, String body) {
            return new Entry(title, body);
    }

    public void addEntry(Entry entry) {

        entries.add(entry);
    }

    public String findEntry(int indexNumber) {
        int index = indexNumber - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (index == i) {
                return entry.getTheDate() + " | " + entry.getTitle() + " | " + entry.getBody();

            }

        }
        return "entry" + indexNumber + "not found";
    }

    public boolean deleteEntry(int indexNumber) {
        int index = indexNumber - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (Objects.equals(i, index)) {
                entries.remove(index);
                return true;
            }
        }
        return false;
    }

    public void unLockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = true;
        }
    }

    public boolean validatePassword(String password) {
        boolean isValid = this.password.equals(password);
        if (!isValid) {
            System.out.println("Invalid password!");
            return false;
        } else
            return true;
    }

    public boolean changePassword(String oldPassword, String newPassword) {

        if (validatePassword(oldPassword)) {
            this.password = newPassword;
            return  true;
        }
        return  false;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void editEntry(int indexNumber, Entry entry) {
        int index = indexNumber - 1;
        entries.set(index, entry);
        for (int i = 0; i < entries.size(); i++) {
             entry = entries.get(i);
            }

    }
    public boolean isLock() {
        return isLocked;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public String displayDiary(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            result.append(entry.toString());
        }
        return result.toString();
    }
}



