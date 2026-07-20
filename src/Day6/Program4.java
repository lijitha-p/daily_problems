package Day6;

import java.util.Scanner;

public class Program4 {

    public static int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        for (String word : words) {

            boolean isConsistent = true;

            for (int i = 0; i < word.length(); i++) {

                if (allowed.indexOf(word.charAt(i)) == -1) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter allowed characters: ");
        String allowed = sc.nextLine();

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        System.out.println("Consistent strings = " +
                countConsistentStrings(allowed, words));

        sc.close();
    }
}