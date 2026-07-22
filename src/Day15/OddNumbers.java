package dailyproblems;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        int count = 0;

        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        System.out.println("Count of odd numbers: " + count);
    }
}