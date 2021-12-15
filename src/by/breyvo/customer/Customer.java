package by.breyvo.customer;

import java.util.Arrays;

public class Customer {
    String surname;
    String name;
    BankAccount[] bankAccounts;

    public Customer(String surname, String name, BankAccount[] bankAccounts) {
        this.surname = surname;
        this.name = name;
        this.bankAccounts = bankAccounts;
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

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }


    @Override
    public String toString() {
        return "Customer - " +
                surname + ' ' +
                name + ' ' + '\n' +
                "BankAccounts=" + '\n' + Arrays.toString(bankAccounts);
    }
}
