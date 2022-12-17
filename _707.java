import java.util.ArrayList;

public class _707 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        String[] a = new String[]{"addAtHead", "addAtTail", "addAtTail", "get", "get", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtTail", "get", "addAtHead", "addAtHead", "addAtIndex", "addAtIndex", "addAtHead", "addAtTail", "deleteAtIndex", "addAtHead", "addAtHead", "addAtIndex", "addAtTail", "get", "addAtIndex", "addAtTail", "addAtHead", "addAtHead", "addAtIndex", "addAtTail", "addAtHead", "addAtHead", "get", "deleteAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "get", "deleteAtIndex", "addAtTail", "addAtHead", "addAtTail", "deleteAtIndex", "addAtTail", "deleteAtIndex", "addAtIndex", "deleteAtIndex", "addAtTail", "addAtHead", "addAtIndex", "addAtHead", "addAtHead", "get", "addAtHead", "get", "addAtHead", "deleteAtIndex", "get", "addAtHead", "addAtTail", "get", "addAtHead", "get", "addAtTail", "get", "addAtTail", "addAtHead", "addAtIndex", "addAtIndex", "addAtHead", "addAtHead", "deleteAtIndex", "get", "addAtHead", "addAtIndex", "addAtTail", "get", "addAtIndex", "get", "addAtIndex", "get", "addAtIndex", "addAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtIndex", "get", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "get", "addAtTail", "addAtHead", "addAtTail", "get", "addAtIndex"};
        String b = "[84],[2],[39],[3],[1],[42],[1,80],[14],[1],[53],[98],[19],[12],[2],[16],[33],[4,17],[6,8],[37],[43],[11],[80],[31],[13,23],[17],[4],[10,0],[21],[73],[22],[24,37],[14],[97],[8],[6],[17],[50],[28],[76],[79],[18],[30],[5],[9],[83],[3],[40],[26],[20,90],[30],[40],[56],[15,23],[51],[21],[26],[83],[30],[12],[8],[4],[20],[45],[10],[56],[18],[33],[2],[70],[57],[31,24],[16,92],[40],[23],[26],[1],[92],[3,78],[42],[18],[39,9],[13],[33,17],[51],[18,95],[18,33],[80],[21],[7],[17,46],[33],[60],[26],[4],[9],[45],[38],[95],[78],[54],[42,86]";
        String[] split = b.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (String s : split) {
            list.add(Integer.valueOf(s.replaceAll("\\D", "")));
        }
        for (String s : a) {
            switch (s) {
                case "get":
                    myLinkedList.get(list.get(index++));
                    break;
                case "addAtHead":
                    myLinkedList.addAtHead(list.get(index++));
                    break;
                case "addAtTail":
                    myLinkedList.addAtTail(list.get(index++));
                    break;
                case "addAtIndex":
                    myLinkedList.addAtIndex(list.get(index++), list.get(index++));
                    break;
                case "deleteAtIndex":
                    myLinkedList.deleteAtIndex(list.get(index++));
                    break;
            }
        }
        myLinkedList.print();
    }
}

class MyLinkedList {

    private ListNode dummyHead;

    private int length;

    public MyLinkedList() {
        this.dummyHead = new ListNode(0, null);
        this.length = 0;
    }

    public int get(int index) {
        if (index >= 0 && index <= this.length - 1) {
            ListNode p = this.dummyHead;
            for (int i = 0; i <= index; i++) {
                p = p.next;
            }
            return p.val;
        }
        return -1;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(this.length, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > this.length) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode p = this.dummyHead;
        ListNode newNode = new ListNode(val);
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
        this.length++;

    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index <= this.length - 1) {
            ListNode p = this.dummyHead;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            p.next = p.next.next;
            this.length--;
        }
    }

    public void print() {
        ListNode p = this.dummyHead;
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.get(i));
        }
    }
}
