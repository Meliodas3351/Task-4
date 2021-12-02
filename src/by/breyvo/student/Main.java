package by.breyvo.student;

public class Main {
    public static void main(String[] args) {
        Student markov = new Student("Markov", "Vadim", 333, new int[]{9, 9, 9, 9, 9});
        Student breywo = new Student("Breywo", "Akexandr", 123, new int[]{8, 9, 8, 7, 10});

        Student[] students = new Student[]{markov, breywo};

        Service service = new Service();
        service.printAllStudents(students);
        System.out.println();
        service.sortOfSurname(students);
        service.printAllStudents(students);
        System.out.println();
        service.printBetterStudents(students);

    }
}
