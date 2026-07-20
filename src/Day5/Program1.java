package Day5;

import java.util.Scanner;

public class Program1 {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int sum = n * (n + 1) / 2;

        for (int num : nums) {
            sum -= num;
        }

        return sum;
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

        System.out.println("Missing number = " + missingNumber(nums));

        sc.close();
    }
}
