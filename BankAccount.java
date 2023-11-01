public class BankAccount {

    protected double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid deposit amount");
        }

    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

}