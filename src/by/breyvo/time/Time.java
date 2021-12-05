package by.breyvo.time;

import java.time.LocalTime;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private LocalTime localTime;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.localTime = LocalTime.of(this.hours, this.minutes, this.seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        setLocalTime();
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        setLocalTime();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        setLocalTime();
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime() {
        this.localTime = LocalTime.of(getHours(), getMinutes(), getSeconds());
    }
}
