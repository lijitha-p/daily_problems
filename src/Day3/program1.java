package Day3;
import java.util.Scanner;
public class program1 {
        public static int numberOfSteps(int num) {

            int steps = 0;

            while (num > 0) {

                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num - 1;
                }

                steps++;
            }

            return steps;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Number of steps = " + numberOfSteps(num));

            sc.close();
        }

}
