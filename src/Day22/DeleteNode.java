package dailyproblems;

import java.util.Scanner;

public class DeleteNode {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {

            ListNode newNode = new ListNode(sc.nextInt());

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter node value to delete: ");
        int value = sc.nextInt();

        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.next.val == value) {
                current.next = current.next.next;
                break;
            }

            current = current.next;
        }

        current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}