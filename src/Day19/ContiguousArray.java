package dailyproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContiguousArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter 0 and 1 values:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int count = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            if (map.containsKey(count)) {
                int length = i - map.get(count);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(count, i);
            }
        }

        System.out.println("Maximum Length: " + maxLength);
    }
}