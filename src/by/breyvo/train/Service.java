package by.breyvo.train;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Service {
    public void sortOfNumbersOfTrain(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getNumberOfTrain() - o2.getNumberOfTrain();
            }
        });
    }

    public void printAllTrains(Train[] trains) {
        for (int k = 0; k < trains.length; k++) {
            System.out.println(trains[k].toString());
        }
    }

    public void receivingTheInformation(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of train - ");
        int input = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int k = 0; k < trains.length; k++) {
            if (input == trains[k].getNumberOfTrain()) {
                check = false;
                System.out.println(trains[k].toString());
                break;
            }
        }
        if (check) {
            System.out.println("Information not found.");
        }
    }

    public void sortOfDestination(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getDestination().equals(o2.getDestination())) {
                    return o1.getTime().compareTo(o2.getTime());
                }
                return o1.getDestination().compareTo(o2.getDestination());
            }
        });

    }


}
