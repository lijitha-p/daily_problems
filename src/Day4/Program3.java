package Day4;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Program3 {

    public static int minOperations(List<Integer> nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        int operations = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {

            operations++;

            if (nums.get(i) <= k) {
                set.add(nums.get(i));
            }

            if (set.size() == k) {
                return operations;
            }
        }

        return operations;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        List<Integer> nums = List.of(arr);

        System.out.println("Minimum operations = " +
                minOperations(nums, k));

        sc.close();
    }
}