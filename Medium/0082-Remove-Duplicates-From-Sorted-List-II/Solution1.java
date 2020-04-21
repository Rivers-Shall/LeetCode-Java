
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = null, curr = head;
        ListNode prevDistinct = null;
        ListNode newHead = null;
        while (curr != null) {
            if ((prev == null || prev.val != curr.val) &&
                (curr.next == null || curr.val != curr.next.val)) {
                    if (prevDistinct == null) {
                        newHead = curr;
                    } else {
                        prevDistinct.next = curr;
                    }
                    prevDistinct = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        if (prevDistinct != null) prevDistinct.next = null;
        return newHead;
    }
}