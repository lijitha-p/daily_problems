package dailyproblems;

import java.util.Scanner;

public class TimeComplexity {

    public static void main(String[] args) {

        int n = 5;

        // O(1) - Constant Time
        System.out.println(n);

        // O(n) - Linear Time
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // O(n²) - Quadratic Time
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}