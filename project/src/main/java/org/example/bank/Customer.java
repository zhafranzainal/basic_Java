package org.example.bank;

public class Customer {

    protected String name;
    protected BankAccount account;

    public Customer(String name) {
        this.name = name;
        this.account = new BankAccount();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void displayBalance() {
        System.out.println(name);
        System.out.println(account.getBalance());
    }

    public static void main(String[] args) {

        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");

        cust1.deposit(200);
        cust2.deposit(300);

        cust1.withdraw(50);
        cust2.withdraw(100);

        cust1.displayBalance();
        cust2.displayBalance();
    }
}
