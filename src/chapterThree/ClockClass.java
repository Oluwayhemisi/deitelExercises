package chapterThree;

import java.util.Scanner;

public class ClockClass {
    Scanner input = new Scanner(System.in);
    private int hour;
    private int minute;
    private int second;

    public ClockClass(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if(hour > 23){
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if(minute > 59){
            this.minute = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        if(second > 59){
            this.second = 0;
        }
    }
    public String displayTime(){

        return hour+":"+minute+":"+second;
    }

    }

