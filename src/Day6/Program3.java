package Day6;

import java.util.Scanner;

public class Program3 {

    public static String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--;

            char ch = (char) ('A' + (columnNumber % 26));

            result.append(ch);

            columnNumber /= 26;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter column number: ");
        int columnNumber = sc.nextInt();

        System.out.println("Excel Column Title = " +
                convertToTitle(columnNumber));

        sc.close();
    }
}
