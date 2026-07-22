package dailyproblems;

import java.util.Scanner;

public class Intersection {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first list size: ");
        int n1 = sc.nextInt();

        ListNode headA = null;
        ListNode tailA = null;

        for (int i = 0; i < n1; i++) {
            ListNode node = new ListNode(sc.nextInt());

            if (headA == null) {
                headA = node;
                tailA = node;
            } else {
                tailA.next = node;
                tailA = node;
            }
        }

        System.out.print("Enter second list size: ");
        int n2 = sc.nextInt();

        ListNode headB = null;
        ListNode tailB = null;

        for (int i = 0; i < n2; i++) {
            ListNode node = new ListNode(sc.nextInt());

            if (headB == null) {
                headB = node;
                tailB = node;
            } else {
                tailB.next = node;
                tailB = node;
            }
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        if (a != null) {
            System.out.println("Intersection at: " + a.val);
        } else {
            System.out.println("No intersection");
        }
    }
}