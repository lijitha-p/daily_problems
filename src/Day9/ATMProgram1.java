package Day9;
import java.util.Scanner;

abstract class ATM {

    // Abstract method
    abstract void withdraw(int amount);

    // Normal method
    void welcomeMessage() {
        System.out.println("Welcome to ATM");
    }
}

class SBIATM extends ATM {

    @Override
    void withdraw(int amount) {
        System.out.println("Withdrawn amount: " + amount);
    }
}

public class ATMProgram1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new SBIATM();

        atm.welcomeMessage();

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        atm.withdraw(amount);

        sc.close();
    }
}
