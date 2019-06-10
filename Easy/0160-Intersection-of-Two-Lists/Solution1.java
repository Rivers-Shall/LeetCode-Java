class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;

        ListNode pointerA = headA;
        while (pointerA != null) {
            ++len1;
            pointerA = pointerA.next;
        }

        ListNode pointerB = headB;
        while (pointerB != null) {
            ++len2;
            pointerB = pointerB.next;
        }

        int diff = Math.abs(len1 - len2);
        pointerA = headA;
        pointerB = headB;
        if (len1 > len2) {
            for (int i = 0; i < diff; ++i) {
                pointerA = pointerA.next;
            }
        } else {
            for (int i = 0; i < diff; ++i) {
                pointerB = pointerB.next;
            }
        }

        while (pointerA != pointerB) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }

        return pointerA;
    }
}