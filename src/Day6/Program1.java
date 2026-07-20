package Day6;

import java.util.Scanner;

public class Program1 {

    public static char findTheDifference(String s, String t) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }

        return (char) result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        System.out.println("Extra character = " + findTheDifference(s, t));

        sc.close();
    }
}