package Day5;

import java.util.Scanner;

public class Program3 {

    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digits = 0;

            while (num > 0) {
                digits++;
                num /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Count = " + findNumbers(nums));

        sc.close();
    }
}