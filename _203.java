public class _203 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null) {
            if (head.val == val) {
                head = head.next;
            } else {
                break;
            }
        }
        ListNode p = head;
        while (p != null) {
            if (p.next != null && p.next.val == val) {
                p.next = p.next.next;
                continue;
            }
            p = p.next;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
