package Day8;

import java.util.Scanner;

class ATM {

    void displayMessage() {
        System.out.println("Welcome to ATM");
    }
}

class BankATM extends ATM {

    void withdraw(int amount) {
        System.out.println("Withdrawn amount: " + amount);
    }
}

public class ATMProgram1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankATM atm = new BankATM();

        atm.displayMessage();

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        atm.withdraw(amount);

        sc.close();
    }
}
