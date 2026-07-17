package Day3;
import java.util.Scanner;

public class Program2 {

    public static int numWaterBottles(int numBottles, int numExchange) {

        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {

            int newBottles = empty / numExchange;

            total += newBottles;

            empty = (empty % numExchange) + newBottles;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();

        System.out.print("Enter exchange value: ");
        int numExchange = sc.nextInt();

        System.out.println("Maximum bottles you can drink = " +
                numWaterBottles(numBottles, numExchange));

        sc.close();
    }
}