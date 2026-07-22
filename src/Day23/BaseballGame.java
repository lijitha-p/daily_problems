package dailyproblems;

import java.util.Scanner;
import java.util.Stack;

public class BaseballGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("C")) {
                stack.pop();

            } else if (operation.equals("D")) {
                stack.push(2 * stack.peek());

            } else if (operation.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();

                stack.push(last);
                stack.push(last + secondLast);

            } else {
                stack.push(Integer.parseInt(operation));
            }
        }

        int sum = 0;

        for (int score : stack) {
            sum += score;
        }

        System.out.println(sum);
    }
}