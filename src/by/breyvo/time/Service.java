package by.breyvo.time;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.*;

public class Service {
    Time time;

    final int MAX_LIMIT_FOR_HOURS = 24;
    final int MAX_LIMIT_FOR_MINUTES_AND_SECONDS = 60;
    final int MAX_LIMIT_TO_PLUS_TIME_FOR_HOURS = 100;

    String[] actionsWithTime = new String[]{"Print Time", "Change a Field", "Plus Time", "Minus Time", "Exit"};
    String[] fieldsOfTime = new String[]{"Hours", "Minutes", "Seconds"};
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
    Icon icon = new ImageIcon();

    void creatTheTime() {
        int hours, minutes, seconds;
        String message = "Please, enter value for hours:";
        hours = enterFieldsForTime(message, MAX_LIMIT_FOR_HOURS);
        message = "Please, enter value for minutes:";
        minutes = enterFieldsForTime(message, MAX_LIMIT_FOR_MINUTES_AND_SECONDS);
        message = "Please, enter value for seconds:";
        seconds = enterFieldsForTime(message, MAX_LIMIT_FOR_MINUTES_AND_SECONDS);
        this.time = new Time(hours, minutes, seconds);
        printTime();
    }

    int enterFieldsForTime(String messageForInput, int maxLimitForInput) {
        int k = 0;
        try {
            k = Integer.parseInt(JOptionPane.showInputDialog(null, messageForInput, "Enter field", JOptionPane.QUESTION_MESSAGE));
            if (k >= maxLimitForInput || k < 0) {
                JOptionPane.showMessageDialog(null, "Incorrect input. Field value changed to 00", "Error", JOptionPane.ERROR_MESSAGE);
                k = 0;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect input. Field value changed to 00", "Error", JOptionPane.ERROR_MESSAGE);
            k = 0;
        }
        return k;
    }

    void printTime() {
        String message = "Time changed: " + this.time.getLocalTime().format(formatter);
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    void choiseOfAction() {

        String action;
        //{"Print Time","Change a Field","Plus Time","Minus Time","Exit"};
        do {
            action = (String) JOptionPane.showInputDialog(null, "Please, choose the action:", "Message", JOptionPane.QUESTION_MESSAGE, icon, actionsWithTime, actionsWithTime[0]);
            if (action.equals(actionsWithTime[0])) {
                printTime();
            } else if (action.equals(actionsWithTime[1])) {
                setFieldOfTime();
            } else if (action.equals(actionsWithTime[2])) {
                plusTime();
            } else if (action.equals(actionsWithTime[3])) {
                minusTime();
            }
        } while (!action.equals(actionsWithTime[4]));
        JOptionPane.showMessageDialog(null, "Successful completion of the program", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    void setFieldOfTime() {
        String field = (String) JOptionPane.showInputDialog(null, "Please, choose a field:", "Message", JOptionPane.QUESTION_MESSAGE, icon, fieldsOfTime, fieldsOfTime[0]);
        if (field.equals(fieldsOfTime[0])) {
            String message = "Please, enter new value for hours:";
            this.time.setHours(enterFieldsForTime(message, MAX_LIMIT_FOR_HOURS));
            printTime();
        } else if (field.equals(fieldsOfTime[1])) {
            String message = "Please, enter new value for minutes:";
            this.time.setMinutes(enterFieldsForTime(message, MAX_LIMIT_FOR_MINUTES_AND_SECONDS));
            printTime();
        } else if (field.equals(fieldsOfTime[2])) {
            String message = "Please, enter new value for seconds:";
            this.time.setSeconds(enterFieldsForTime(message, MAX_LIMIT_FOR_MINUTES_AND_SECONDS));
            printTime();
        }
    }

    void plusTime() {
        int hours, minutes, seconds;
        String message = "Please, enter value for hours:";
        hours = enterFieldsForTime(message, MAX_LIMIT_TO_PLUS_TIME_FOR_HOURS);
        message = "Please, enter value for minutes:";
        minutes = enterFieldsForTime(message, MAX_LIMIT_FOR_MINUTES_AND_SECONDS);
        message = "Please, enter value for seconds:";
        seconds = enterFieldsForTime(message, MAX_LIMIT_FOR_MINUTES_AND_SECONDS);
        int time = (this.time.getHours() + hours) * 3600 + (this.time.getMinutes() + minutes) * 60 + (this.time.getSeconds() + seconds);
        this.time.setHours((time / (3600)) % 24);
        time %= 3600;
        this.time.setMinutes(time / 60);
        this.time.setSeconds(time % 60);
        printTime();
    }

    void minusTime() {
        int hours, minutes, seconds;
        String message = "Please, enter value for hours:";
        hours = enterFieldsForTime(message, MAX_LIMIT_TO_PLUS_TIME_FOR_HOURS);
        message = "Please, enter value for minutes:";
        minutes = enterFieldsForTime(message, MAX_LIMIT_FOR_MINUTES_AND_SECONDS);
        message = "Please, enter value for seconds:";
        seconds = enterFieldsForTime(message, MAX_LIMIT_FOR_MINUTES_AND_SECONDS);
        int time = (this.time.getHours() + 24 - hours % 24) * 3600 + (this.time.getMinutes() - minutes) * 60 + (this.time.getSeconds() - seconds);
        this.time.setHours((time / (3600)) % 24);
        time %= 3600;
        this.time.setMinutes(time / 60);
        this.time.setSeconds(time % 60);
        printTime();
    }

}
