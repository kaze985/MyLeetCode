public class _160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null) {
            lengthA++;
            curA = curA.next;
        }
        while (curB != null) {
            lengthB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                curA = curA.next;
            }
        } else if (lengthA < lengthB) {
            for (int i = 0; i < lengthB - lengthA; i++) {
                curB = curB.next;
            }
        }
        while (curA != curB) {
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }
}
