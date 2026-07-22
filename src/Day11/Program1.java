package Day11;


import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinate: ");
        String coordinates = sc.next();

        int column = coordinates.charAt(0) - 'a' + 1;
        int row = coordinates.charAt(1) - '0';

        boolean result = column % 2 != row % 2;

        System.out.println(result);
    }
}