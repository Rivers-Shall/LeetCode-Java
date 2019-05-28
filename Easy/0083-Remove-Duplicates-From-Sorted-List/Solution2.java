class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        head.next = deleteDuplicates(head.next);
        if (head.next != null && head.next.val == head.val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head = s.deleteDuplicates(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}