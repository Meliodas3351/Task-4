package by.breyvo.student;

import java.util.Arrays;
import java.util.Comparator;

public class Service {
    private final int MARK_NINE = 9;
    private final int MARK_TEN = 10;

    public void printAllStudents(Student[] student) {
        for (Student student1 : student) {
            System.out.println(student.toString());
        }
    }

    public Student[] sortOfSurname(Student[] students) {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        return students;
    }

    public void printBetterStudents(Student[] students) {
        for (int k = 0; k < students.length; k++) {
            boolean proverka = true;
            for (int i = 0; i < students[k].getArrayOfMarks().length; i++) {
                if (students[k].getArrayOfMarks()[i] <= MARK_NINE) {
                    proverka = false;
                    break;
                }
            }
            if (proverka) {
                System.out.println(students[k].toString());
            }
        }
    }
}
