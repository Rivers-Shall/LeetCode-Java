class Solution2 {
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode reversed, ListNode head) {
        if (head == null) return reversed;
        ListNode next = head.next;
        head.next = reversed;
        return reverse(head, next);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode.printList(s.reverseList(head));
    }
}