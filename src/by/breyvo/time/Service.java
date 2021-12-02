package by.breyvo.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Service {
    private int hours;
    private int minutes;
    private int seconds;
    private LocalTime localTime;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours % 24;
        printLocalTime();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes % 60;
        printLocalTime();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds % 60;
        printLocalTime();
    }

    void creatTheTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours - ");
        String str1 = scanner.nextLine();
        try {
            this.hours = Integer.parseInt(str1);
            if (this.hours > 23 || this.hours < 0) {
                this.hours = 0;
            }
        } catch (NumberFormatException e) {
            this.hours = 0;
        }
        System.out.print("Enter minutes - ");
        str1 = scanner.nextLine();
        try {
            this.minutes = Integer.parseInt(str1);
            if (this.minutes > 59 || this.minutes < 0) {
                this.minutes = 0;
            }
        } catch (NumberFormatException e) {
            this.minutes = 0;
        }
        System.out.print("Enter seconds - ");
        str1 = scanner.nextLine();
        try {
            this.seconds = Integer.parseInt(str1);
            if (this.seconds > 59 || this.seconds < 0) {
                this.seconds = 0;
            }
        } catch (NumberFormatException e) {
            this.seconds = 0;
        }
        printLocalTime();
    }

    void printLocalTime() {
        this.localTime = LocalTime.of(this.getHours(), this.getMinutes(), this.getSeconds());
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(this.localTime.format(formatter));
    }

    void plusTime(int hours, int minutes, int seconds) {
        this.seconds += seconds;
        this.minutes += minutes + this.seconds / 60;
        this.hours += hours + this.minutes / 60;
        this.seconds %= 60;
        this.minutes %= 60;
        this.hours %= 24;
        this.localTime = LocalTime.of(this.getHours(), this.getMinutes(), this.getSeconds());
        printLocalTime();
    }
}
