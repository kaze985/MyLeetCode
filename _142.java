public class _142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode index = head;
                ListNode index1 = fast;
                while (index != index1) {
                    index = index.next;
                    index1 = index1.next;
                }
                return index;
            }
        }
        return null;
    }
}
