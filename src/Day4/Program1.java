package Day4;
    import java.util.Scanner;
    public class Program1 {

        public static int reverseBits(int n) {

            int result = 0;

            for (int i = 0; i < 32; i++) {

                result = (result << 1) | (n & 1);

                n = n >> 1;
            }

            return result;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int result = reverseBits(n);

            System.out.println("Reversed bits result = " + result);

            sc.close();
        }
    }

