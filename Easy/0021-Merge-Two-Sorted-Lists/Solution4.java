class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead;
        ListNode newTail;
        // create a dummy head node
        newHead = newTail = new ListNode(0);
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                newTail.next = l2;
                l2 = null;
            } else if (l2 == null) {
                newTail.next = l1;
                l1 = null;
            } else if (l1.val <= l2.val) {
                newTail.next = l1;
                l1 = l1.next;
            } else {
                newTail.next = l2;
                l2 = l2.next;
            }
            newTail = newTail.next;
        }
        // remove dummy head node
        return newHead.next;
    }
}