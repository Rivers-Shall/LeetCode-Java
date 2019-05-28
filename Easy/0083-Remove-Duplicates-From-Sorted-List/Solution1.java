
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}



class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode originHead = head;
        while (head != null) {
            ListNode nextNode = head.next;
            while (nextNode != null && nextNode.val == head.val) {
                nextNode = nextNode.next;
            }
            head.next = nextNode;
            head = head.next;
        }
        return originHead;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head = s.deleteDuplicates(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}