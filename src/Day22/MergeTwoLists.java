package dailyproblems;

import java.util.Scanner;

public class MergeTwoLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();

        ListNode head1 = null;
        ListNode tail1 = null;

        for (int i = 0; i < n1; i++) {
            ListNode newNode = new ListNode(sc.nextInt());

            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();

        ListNode head2 = null;
        ListNode tail2 = null;

        for (int i = 0; i < n2; i++) {
            ListNode newNode = new ListNode(sc.nextInt());

            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (head1 != null && head2 != null) {

            if (head1.val <= head2.val) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }

            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        current = dummy.next;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}