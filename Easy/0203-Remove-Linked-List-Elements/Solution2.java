class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(1);
        ListNode newTail = newHead;
        while (head != null) {
            if (head.val != val) {
                newTail.next = new ListNode(head.val);
                newTail = newTail.next;
            }
            head = head.next;
        }
        return newHead.next;
    }
}