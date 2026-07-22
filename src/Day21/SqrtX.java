package dailyproblems;

import java.util.Scanner;

public class SqrtX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int result = (int) Math.sqrt(x);

        System.out.println(result);
    }
}