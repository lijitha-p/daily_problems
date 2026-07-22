package dailyproblems;

import java.util.Scanner;

public class BitwiseOr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int or = nums[i] | nums[j];

                if (or % 2 == 0) {
                    result = true;
                }
            }
        }

        System.out.println(result);
    }
}