public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution1 {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        ListNode next = node.next;
        while (next.next != null) {
            curr.val = next.val;
            curr = next;
            next = curr.next;
        }
        curr.val = next.val;
        curr.next = null;
    }
}