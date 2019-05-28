class Solution3 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        head.next = deleteDuplicates(head.next);
        return (head.next.val == head.val) ? head.next : head;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
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