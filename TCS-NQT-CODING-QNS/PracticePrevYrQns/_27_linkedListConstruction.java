
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class _27_linkedListConstruction {
    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        for (int num : arr) {
            tail.next = new ListNode(num);
            tail = tail.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        ListNode head = buildList(arr);
        printList(head);

        scan.close();
    }
}
