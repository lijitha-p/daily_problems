package dailyproblems;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        System.out.print("Enter mass: ");
        int mass = sc.nextInt();

        boolean bulky = false;
        boolean heavy = false;

        // Bulky condition
        if (length >= 10000 || width >= 10000 || height >= 10000
                || (long) length * width * height >= 1000000000L) {
            bulky = true;
        }

        // Heavy condition
        if (mass >= 100) {
            heavy = true;
        }

        if (bulky && heavy) {
            System.out.println("Both");
        } else if (bulky) {
            System.out.println("Bulky");
        } else if (heavy) {
            System.out.println("Heavy");
        } else {
            System.out.println("Neither");
        }
    }
}
