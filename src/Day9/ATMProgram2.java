package Day9;
import java.util.Scanner;

class BankAccount {

    private int balance;

    // Setter method
    public void deposit(int amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Getter method
    public int getBalance() {
        return balance;
    }

    // Withdraw method
    public void withdraw(int amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class ATMProgram2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter deposit amount: ");
        int depositAmount = sc.nextInt();

        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = sc.nextInt();

        account.withdraw(withdrawAmount);

        System.out.println("Current Balance: " +
                account.getBalance());

        sc.close();
    }
}