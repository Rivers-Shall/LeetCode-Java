class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode toDelete = head;
        ListNode last = head;

        for (int i = 0; i < n; ++i) {
            last = last.next;
        }
        while (last != null && last.next != null) {
            toDelete = toDelete.next;
            last = last.next;
        }

        if (last == null) {
            head = head.next;
        } else {
            toDelete.next = toDelete.next.next;
        }
        return head;
    }
}