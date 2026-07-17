package Day2;

import java.util.Scanner;

public class day2program1 {

    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        if (k <= numOnes) {
            return k;
        }

        k -= numOnes;

        if (k <= numZeros) {
            return numOnes;
        }

        k -= numZeros;

        return numOnes - k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of 1s: ");
        int numOnes = sc.nextInt();

        System.out.print("Enter number of 0s: ");
        int numZeros = sc.nextInt();

        System.out.print("Enter number of -1s: ");
        int numNegOnes = sc.nextInt();

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k);

        System.out.println("Maximum Sum = " + result);

        sc.close();
    }
}