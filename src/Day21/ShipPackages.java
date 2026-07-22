package dailyproblems;

import java.util.Scanner;

public class ShipPackages {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] weights = new int[n];

        int low = 0;
        int high = 0;

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();

            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        int days = sc.nextInt();

        while (low < high) {

            int capacity = low + (high - low) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            for (int weight : weights) {

                if (currentWeight + weight > capacity) {
                    requiredDays++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            if (requiredDays <= days) {
                high = capacity;
            } else {
                low = capacity + 1;
            }
        }

        System.out.println(low);
    }
}
