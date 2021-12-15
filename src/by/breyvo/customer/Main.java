package by.breyvo.customer;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("723456", 1456, false);
        BankAccount account2 = new BankAccount("143763", -234, false);
        BankAccount account3 = new BankAccount("957382", -1234, true);

        BankAccount account4 = new BankAccount("3455", 543, false);
        BankAccount account5 = new BankAccount("3463", -234, false);
        BankAccount account6 = new BankAccount("0123", -987, false);

        BankAccount[] bankAccounts2 = new BankAccount[]{account1, account2, account3};
        BankAccount[] bankAccounts1 = new BankAccount[]{account4, account5, account6};

        Customer customer1 = new Customer("Markov", "Vadim", bankAccounts1);
        Customer customer2 = new Customer("Breywo", "Alexander", bankAccounts2);
        Customer[] customers = new Customer[]{customer1, customer2};

        Service service = new Service();
        //service.printCustomers(customers);
        //service.sortOfCustomers(customers);
        //service.printCustomers(customers);
        service.sumOfMoneyFromPlusAccounts(customer1);
        service.sumOfMoneyFromMinusAccounts(customer1);
    }
}
