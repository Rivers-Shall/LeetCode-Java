class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            ++length;
            tail = tail.next;
        }
        tail.next = head; // in case length == 1

        k = length - (k % length);
        ListNode newTail = head;
        for (int i = 0; i < k - 1; ++i) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        tail.next = head;
        newTail.next = null;
        return newHead;
    }
}