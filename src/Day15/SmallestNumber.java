package dailyproblems;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = 1;

        while (result < n) {
            result = result * 2 + 1;
        }

        System.out.println("Result: " + result);
    }
}