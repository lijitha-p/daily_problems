package Day2;
import java.util.Scanner;

public class day2program2 {

    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   // ✅ Initialized

        System.out.println("Result = " + addDigits(num));

        sc.close();
    }
}