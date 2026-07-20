package Day4;

import java.util.Scanner;

public class Program4 {

    public static int smallestNumber(int n) {

        int power = 1;

        while (power <= n) {
            power = power * 2;
        }

        return power - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Smallest number = " + smallestNumber(n));

        sc.close();
    }
}
