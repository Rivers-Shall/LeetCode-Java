class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessThanHead = null, lessThanTail = null, greaterOrEqualHead = null, greaterOrEqualTail = null;
        while (head != null) {
            if (head.val < x) {
                if (lessThanHead == null) {
                    lessThanHead = head;
                    lessThanTail = head;
                } else {
                    lessThanTail.next = head;
                    lessThanTail = head;
                }
            } else {
                if (greaterOrEqualHead == null) {
                    greaterOrEqualHead = head;
                    greaterOrEqualTail = head;
                } else {
                    greaterOrEqualTail.next = head;
                    greaterOrEqualTail = head;
                }
            }
            head = head.next;
        }
        if (lessThanHead != null) lessThanTail.next = greaterOrEqualHead;
        else lessThanHead = greaterOrEqualHead;

        if (greaterOrEqualTail != null) greaterOrEqualTail.next = null;
        return lessThanHead;
    }
}