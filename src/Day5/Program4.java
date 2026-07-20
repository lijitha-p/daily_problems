package Day5;

import java.util.Scanner;

public class Program4 {

    public static int[] distributeCandies(int candies, int num_people) {

        int[] result = new int[num_people];

        int give = 1;
        int index = 0;

        while (candies > 0) {

            int amount = Math.min(candies, give);

            result[index] += amount;

            candies -= amount;

            give++;

            index++;

            if (index == num_people) {
                index = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candies: ");
        int candies = sc.nextInt();

        System.out.print("Enter number of people: ");
        int num_people = sc.nextInt();

        int[] result = distributeCandies(candies, num_people);

        System.out.print("Candies distributed: ");

        for (int candy : result) {
            System.out.print(candy + " ");
        }

        sc.close();
    }
}