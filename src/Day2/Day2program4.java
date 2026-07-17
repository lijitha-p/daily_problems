package Day2;
    import java.util.Scanner;
    public class Day2program4
    {
        public static int passThePillow(int n, int time) {

            int round = time / (n - 1);
            int rem = time % (n - 1);

            if (round % 2 == 0) {
                return rem + 1;
            } else {
                return n - rem;
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of people: ");
            int n = sc.nextInt();

            System.out.print("Enter time: ");
            int time = sc.nextInt();

            System.out.println("Person holding the pillow = " + passThePillow(n, time));

            sc.close();
        }
    }

