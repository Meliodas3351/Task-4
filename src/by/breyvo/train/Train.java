package by.breyvo.train;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Train {
    private String destination;
    private int numberOfTrain;
    private LocalTime time;

    public Train(String destination, int numberOfTrain, String time) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.time = LocalTime.parse(time, DateTimeFormatter.ISO_TIME);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = LocalTime.parse(time, DateTimeFormatter.ISO_TIME);
    }

    @Override
    public String toString() {
        return "Train " +
                "to " + destination +
                ", number " + numberOfTrain +
                ", time=" + time +
                '.';
    }
}
