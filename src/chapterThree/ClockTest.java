package chapterThree;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClockClass heartRate = new ClockClass(0, 0, 0);
        int hour=0;
        int second=0;
        int minute=0;
        System.out.println("enter  hour:");
        hour = scanner.nextInt();

        System.out.println("enter  minute:");
        minute= scanner.nextInt();

        System.out.println("enter  second:");
        second=scanner.nextInt();

        heartRate.setHour(hour);
        heartRate.setSecond(minute);
        heartRate.setMinute(second);


        System.out.println();
        System.out.println(heartRate.displayTime());


    }
}