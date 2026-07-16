package dailyproblems;

import java.util.Scanner;

public class Day1program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is Uppercase.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is Lowercase.");
        } else {
            System.out.println("The entered character is not an alphabet.");
        }

        sc.close();
    }
}