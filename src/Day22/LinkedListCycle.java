package dailyproblems;

import java.util.Scanner;

public class LinkedListCycle {

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

        ListNode[] nodes = new ListNode[n];

        for (int i = 0; i < n; i++) {

            nodes[i] = new ListNode(sc.nextInt());

            if (head == null) {
                head = nodes[i];
                tail = nodes[i];
            } else {
                tail.next = nodes[i];
                tail = nodes[i];
            }
        }

        System.out.print("Enter cycle index (-1 for no cycle): ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < n) {
            tail.next = nodes[pos];
        }

        ListNode slow = head;
        ListNode fast = head;

        boolean hasCycle = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        System.out.println(hasCycle);
    }
}