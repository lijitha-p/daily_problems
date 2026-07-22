package dailyproblems;

import java.util.Arrays;
import java.util.Scanner;

public class ProductExceptSelf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = new int[n];

        int product = 1;

        // Left products
        for (int i = 0; i < n; i++) {
            result[i] = product;
            product *= nums[i];
        }

        product = 1;

        // Right products
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }

        System.out.println(Arrays.toString(result));
    }
}