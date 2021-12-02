package by.breyvo.train;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train("Hrodno", 731, "15:17");
        Train train2 = new Train("Gomel", 684, "00:25");
        Train train3 = new Train("Brest", 667, "11:52");
        Train train4 = new Train("Vitebsk", 712, "06:45");
        Train train5 = new Train("Moscow", 718, "16:00");
        Train train6 = new Train("Hrodno", 687, "07:08");

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
