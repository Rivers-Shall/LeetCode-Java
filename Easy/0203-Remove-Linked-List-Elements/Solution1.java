class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution1 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        head.next = removeElements(head.next, val);

        if (head.val == val) return head.next;
        else                 return head;
    }
}