package Day6;

import java.util.Scanner;

public class Program2 {

    public static String bestHand(int[] ranks, char[] suits) {

        // Check Flush
        boolean flush = true;

        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[0]) {
                flush = false;
                break;
            }
        }

        if (flush) {
            return "Flush";
        }

        // Count rank frequencies
        int[] count = new int[14];

        for (int rank : ranks) {
            count[rank]++;
        }

        boolean pair = false;

        for (int i = 1; i <= 13; i++) {

            if (count[i] >= 3) {
                return "Three of a Kind";
            }

            if (count[i] == 2) {
                pair = true;
            }
        }

        if (pair) {
            return "Pair";
        }

        return "High Card";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ranks = new int[5];
        char[] suits = new char[5];

        System.out.println("Enter 5 ranks:");

        for (int i = 0; i < 5; i++) {
            ranks[i] = sc.nextInt();
        }

        System.out.println("Enter 5 suits:");

        for (int i = 0; i < 5; i++) {
            suits[i] = sc.next().charAt(0);
        }

        System.out.println("Best Poker Hand = " + bestHand(ranks, suits));

        sc.close();
    }
}
