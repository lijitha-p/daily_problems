package Day4;
import java.util.Scanner;
public class Program2 {

    public static int countPrimeSetBits(int left, int right) {

        int count = 0;

        for (int i = left; i <= right; i++) {

            int setBits = Integer.bitCount(i);

            if (isPrime(setBits)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter left: ");
        int left = sc.nextInt();

        System.out.print("Enter right: ");
        int right = sc.nextInt();

        System.out.println("Count = " + countPrimeSetBits(left, right));

        sc.close();
    }
}
