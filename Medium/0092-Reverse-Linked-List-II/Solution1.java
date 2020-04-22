
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        if (next == null) {
            return val + "";
        }
        return val + "," + next.toString();
    }
}

public class Solution1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prev = null, curr = head;
        for (int i = 0; i < m - 1; ++i) {
            prev = curr;
            curr = curr.next;
        }
        ListNode next = curr.next;
        for (int i = 0; i < n - m; ++i) {
            ListNode nextNext = next.next;
            next.next = curr;
            curr = next;
            next = nextNext;
        }
        if (prev != null) {
            prev.next.next = next;
            prev.next = curr;
        } else {
            head.next = next;
            head = curr;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        a1.next = a2;
        ListNode a3 = new ListNode(3);
        a2.next = a3;
        ListNode a4 = new ListNode(4);
        a3.next = a4;

        Solution1 s = new Solution1();
        System.out.println(a1);
        System.out.println(a1 = s.reverseBetween(a1, 1, 4));
        System.out.println(a1 = s.reverseBetween(a1, 2, 3));
        System.out.println(a1 = s.reverseBetween(a1, 1, 3));
        System.out.println(a1 = s.reverseBetween(a1, 2, 4));
        System.out.println(a1 = s.reverseBetween(a1, 2, 2));
    }
}