public class _24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode cur = dummyHead;
        while (cur.next != null && cur.next.next != null) {
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            ListNode temp2 = cur.next.next;
            cur.next.next = temp;
            temp.next = temp2;

            cur = cur.next.next;
        }
        return dummyHead.next;
    }
}
