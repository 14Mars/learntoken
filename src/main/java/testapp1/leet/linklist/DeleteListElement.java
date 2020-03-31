package testapp1.leet.linklist;


public class DeleteListElement {


    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;


        ListNode current = dummyHead;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }


        return dummyHead.next;


    }


    public ListNode removeElements2(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;


        ListNode pre = dummyHead;
        ListNode current = dummyHead.next;

        while (current != null) {
            if (current.val == val) {
                pre.next = current.next;
            } else {
                pre = pre.next;
            }
            current = current.next;


        }


        return null;


    }


    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
