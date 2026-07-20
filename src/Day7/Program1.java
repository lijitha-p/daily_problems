package Day7;

import java.util.Scanner;

public class Program1 {

    int balance;

    // Constructor
    Program1(int initialBalance) {
        balance = initialBalance;
    }

    // Deposit method
    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw method
    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Display balance method
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int initialBalance = sc.nextInt();

        Program1 atm = new Program1(initialBalance);

        System.out.print("Enter deposit amount: ");
        int depositAmount = sc.nextInt();
        atm.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = sc.nextInt();
        atm.withdraw(withdrawAmount);

        atm.displayBalance();

        sc.close();
    }
}
