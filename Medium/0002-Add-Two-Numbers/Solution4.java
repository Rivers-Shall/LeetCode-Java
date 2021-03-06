
class Solution4 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead, newTail;
        newHead = newTail = new ListNode(0);

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int newVal = carry;
            ListNode curNode = (l1 == null) ? l2 : l1;
            if (l1 != null) newVal += l1.val;
            if (l2 != null) newVal += l2.val;

            if (curNode == null) curNode = new ListNode(newVal % 10);
            else                 curNode.val = newVal % 10;
            newTail.next = curNode;
            newTail = newTail.next;

            carry = newVal / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode sum = s.addTwoNumbers(l1, l2);
        while (sum != null) {
            System.out.print(sum.val);
            sum = sum.next;
        }
    }
}