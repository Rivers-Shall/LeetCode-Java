class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = this;
        if (current != null) {
            while (current.next != null) {
                sb.append(current.val).append(", ");
                current = current.next;
            }
        }
        sb.append(current.val).append("]");
        return sb.toString();
    }
}

class Solution1 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode previous = null;
        ListNode first = head;
        ListNode second = head.next;
        ListNode newHead = head.next;
        while (second != null) {
            // swap the nodes pair
            if (previous != null) {
                previous.next = second;
            }
            first.next = second.next;
            second.next = first;

            // prepare for the next pair
            previous = first;
            first = first.next;
            second = (first == null) ? null : first.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println(head);
        System.out.println(s.swapPairs(head));
    }
}