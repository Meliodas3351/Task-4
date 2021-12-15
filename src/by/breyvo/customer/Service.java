package by.breyvo.customer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);

    void findAccount(Customer[] customers) {
        String numberOfAccount;
        System.out.print("Enter number of account - ");
        numberOfAccount = scanner.nextLine();
        for (int k = 0; k < customers.length; k++) {
            boolean check = false;
            for (int i = 0; i < customers[k].getBankAccounts().length; i++) {
                if (numberOfAccount.equals(customers[k].getBankAccounts()[i].getNumberOfAccount())) {
                    check = true;
                    System.out.println(customers[k].getSurname() + " " + customers[k].getName() + " " + customers[k].getBankAccounts()[i].getMoney() + "$");
                    break;
                }
            }
            if (check) {
                break;
            }
        }
    }

    void sortOfCustomers(Customer[] customers) {
        for (int k = 0; k < customers.length; k++) {
            Arrays.sort(customers[k].getBankAccounts(), new Comparator<BankAccount>() {
                @Override
                public int compare(BankAccount o1, BankAccount o2) {
                    return o1.getNumberOfAccount().compareTo(o2.numberOfAccount);
                }
            });
        }
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
    }

    void sumOfMoneyForCustomer(Customer customer) {
        int sum = 0;
        for (int k = 0; k < customer.getBankAccounts().length; k++) {
            if (customer.getBankAccounts()[k].block == false) {
                sum += customer.getBankAccounts()[k].getMoney();
            }
        }
        System.out.println("Sum of money for " + customer.getSurname() + " - " + sum + "$");
    }

    void printCustomers(Customer[] customers) {
        for (int k = 0; k < customers.length; k++) {
            System.out.println(customers[k]);
        }
    }

    void sumOfMoneyFromPlusAccounts(Customer customer) {
        int sum = 0;
        for (int k = 0; k < customer.getBankAccounts().length; k++) {
            if (customer.getBankAccounts()[k].block == false && customer.getBankAccounts()[k].getMoney() > 0) {
                sum += customer.getBankAccounts()[k].getMoney();
            }
        }
        System.out.println("Sum of plus money for " + customer.getSurname() + " - " + sum + "$");
    }

    void sumOfMoneyFromMinusAccounts(Customer customer) {
        int sum = 0;
        for (int k = 0; k < customer.getBankAccounts().length; k++) {
            if (customer.getBankAccounts()[k].block == false && customer.getBankAccounts()[k].getMoney() < 0) {
                sum += customer.getBankAccounts()[k].getMoney();
            }
        }
        System.out.println("Sum of minus money for " + customer.getSurname() + " - " + sum + "$");
    }
}
