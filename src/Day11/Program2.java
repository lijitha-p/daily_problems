package Day11;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean[] seen = new boolean[26];

        for (char ch : s.toCharArray()) {

            int index = ch - 'a';

            if (seen[index]) {
                System.out.println("First repeated character: " + ch);
                return;
            }

            seen[index] = true;
        }
    }
}
