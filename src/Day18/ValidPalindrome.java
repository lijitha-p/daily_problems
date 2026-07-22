package dailyproblems;

import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        String reversed = new StringBuilder(cleaned)
                .reverse()
                .toString();

        if (cleaned.equals(reversed)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}