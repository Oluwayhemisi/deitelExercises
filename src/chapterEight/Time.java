package chapterEight;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }





    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecondsWith(second);
        this.second = second;
    }




    private static void validate(int hour, int minute, int second){
        validateHour(hour);

        validateMinute(minute);


        validateSecondsWith(second);


    }

    private static void validateSecondsWith(int second) {
        boolean secondIsInvalid = second < 0 || second >= 24;
        if (secondIsInvalid) throw new IllegalArgumentException("invalid seconds");
    }

    private static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute < 0 || minute >= 24;
        if (minuteIsInvalid) throw new IllegalArgumentException("invalid minute");
    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if (hourIsInvalid) throw new IllegalArgumentException("invalid hour");
    }
    public Time(){
        this(0);

    }
    public Time (int second){
        this(0,0);
        this.second = second;
    }
    public Time(int minute,int second){
        this(0,0,0);
    }
}