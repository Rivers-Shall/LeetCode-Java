class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution1 {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != head) {
            ListNode next = curr.next;
            curr.next = head;
            curr = next;
        }
        return curr != null;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        ListNode head = new ListNode(1);
        head.next = head;
        // head.next = new ListNode(2);
        // head.next.next = head.next;
        System.out.println(s.hasCycle(head));
    }
}