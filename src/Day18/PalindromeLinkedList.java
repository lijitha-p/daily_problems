package dailyproblems;

import java.util.Scanner;

public class PalindromeLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        ListNode current = head;
        int[] values = new int[n];
        int index = 0;

        while (current != null) {
            values[index++] = current.val;
            current = current.next;
        }

        boolean palindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (values[i] != values[n - 1 - i]) {
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome);
    }
}