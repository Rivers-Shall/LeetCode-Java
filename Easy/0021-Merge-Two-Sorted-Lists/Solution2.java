class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode newHead = null;
        if (l1.val > l2.val) {
            newHead = l2;
            newHead.next = mergeTwoLists(l1, l2.next);
        } else {
            newHead = l1;
            newHead.next = mergeTwoLists(l1.next, l2);
        }
        return newHead;
    }
}