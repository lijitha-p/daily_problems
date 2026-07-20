package Day8;

import java.util.Scanner;

class ATM {

    void withdraw() {
        System.out.println("ATM withdrawal");
    }
}

class SBIATM extends ATM {

    @Override
    void withdraw() {
        System.out.println("SBI ATM withdrawal");
    }
}

class HDFCATM extends ATM {

    @Override
    void withdraw() {
        System.out.println("HDFC ATM withdrawal");
    }
}

public class ATMProgram2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. SBI ATM");
        System.out.println("2. HDFC ATM");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        ATM atm;

        if (choice == 1) {
            atm = new SBIATM();
        } else {
            atm = new HDFCATM();
        }

        atm.withdraw();

        sc.close();
    }
}