class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static void printList(ListNode head) {
        System.out.print("[");
        System.out.print(head.val);
        head = head.next;
        while (head != null) {
            System.out.print(", " + head.val);
            head = head.next;
        }
        System.out.print("]");
    }
}

class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        
        return curr;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode.printList(s.reverseList(head));
    }
}