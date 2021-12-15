package by.breyvo.train;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Train train1 = new Train("Hrodno", 731, LocalTime.of(23, 15));
        Train train2 = new Train("Gomel", 684, LocalTime.of(0, 25));
        Train train3 = new Train("Brest", 667, LocalTime.of(11, 52));
        Train train4 = new Train("Vitebsk", 712, LocalTime.of(6, 45));
        Train train5 = new Train("Moscow", 718, LocalTime.of(16, 0));
        Train train6 = new Train("Hrodno", 687, LocalTime.of(7, 8));

        Train[] trains = new Train[]{train1, train2, train3, train4, train5, train6};

        Service service = new Service();

        service.printAllTrains(trains);
        service.sortOfNumbersOfTrain(trains);
        System.out.println();
        service.printAllTrains(trains);
        System.out.println();
        service.receivingTheInformation(trains);
        System.out.println();
        service.sortOfDestination(trains);
        service.printAllTrains(trains);
    }
}
