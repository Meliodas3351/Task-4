package by.breyvo.customer;

public class BankAccount {
    String numberOfAccount;
    int money;
    boolean block;

    public BankAccount(String numberOfAccount, int money, boolean block) {
        this.numberOfAccount = numberOfAccount;
        this.money = money;
        this.block = block;
    }

    public String getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(String numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "BankAccount number " + numberOfAccount +
                ", money " + money + "$" + "\n";
    }
}
