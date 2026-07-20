package Day7;

import java.util.Scanner;

public class ATMProgram2 {

    String accountHolder;
    int pin;

    // Constructor
    ATMProgram2(String accountHolder, int pin) {
        this.accountHolder = accountHolder;
        this.pin = pin;
    }

    // Login method
    boolean login(int enteredPin) {
        return pin == enteredPin;
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Login successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Set your PIN: ");
        int pin = sc.nextInt();

        ATMProgram2 atm = new ATMProgram2(name, pin);

        System.out.print("Enter PIN to login: ");
        int enteredPin = sc.nextInt();

        if (atm.login(enteredPin)) {
            atm.displayDetails();
        } else {
            System.out.println("Invalid PIN.");
        }

        sc.close();
    }
}