package dailyproblems;

import java.util.Scanner;

public class koko {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] piles = new int[n];

        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        int h = sc.nextInt();

        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {

            int speed = low + (high - low) / 2;
            int hours = 0;

            for (int pile : piles) {
                hours += (pile + speed - 1) / speed;
            }

            if (hours <= h) {
                answer = speed;
                high = speed - 1;
            } else {
                low = speed + 1;
            }
        }

        System.out.println(answer);
    }
}