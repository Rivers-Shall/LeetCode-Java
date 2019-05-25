

class Solution2 {
    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            if (carry == 0) return null;
            else return new ListNode(carry);
        }
        int newVal = carry;
        if (l1 != null) newVal += l1.val;
        if (l2 != null) newVal += l2.val;

        ListNode head = new ListNode(newVal % 10);
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
        head.next = addTwoNumbers(l1, l2, newVal / 10);
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode sum = s.addTwoNumbers(l1, l2);
        while (sum != null) {
            System.out.print(sum.val);
            sum = sum.next;
        }
    }
}