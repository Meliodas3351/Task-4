package by.breyvo.student;

import java.util.Arrays;

public class Student {
    private String surname;
    private String name;
    private int numberOfGroup;
    private int[] arrayOfMarks;


    public Student(String surname, String name, int numberOfGroup, int[] arrayOfMarks) {
        this.surname = surname;
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.arrayOfMarks = arrayOfMarks;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int[] getArrayOfMarks() {
        return arrayOfMarks;
    }

    public void setArrayOfMarks(int[] arrayOfMarks) {
        this.arrayOfMarks = arrayOfMarks;
    }

    @Override
    public String toString() {
        return "Student " +
                surname +
                " " + name +
                ", numberOfGroup=" + numberOfGroup +
                ",  marks: " + Arrays.toString(arrayOfMarks);
    }

}
