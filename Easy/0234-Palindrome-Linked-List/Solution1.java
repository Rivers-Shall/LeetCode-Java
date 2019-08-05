class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution1 {
    public boolean isPalindrome(ListNode head) {
        int nNode = 0;
        ListNode current = head;
        // count the nodes
        while (current != null) {
            ++nNode;
            current = current.next;
        }

        // reverse the first \lfloor nNode / 2 \rfloor nodes
        ListNode prev = null;
        current = head;
        for (int i = 0; i < nNode / 2; ++i) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        if (nNode % 2 == 1) {
            current = current.next;
        }

        // check if it is palindrome
        for (int i = 0; i < nNode / 2; ++i) {
            if (head.val != current.val) {
                return false;
            }
            head = head.next;
            current = current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        //head.next.next.next = new ListNode(1);
        System.out.println(s.isPalindrome(head));
    }
}
