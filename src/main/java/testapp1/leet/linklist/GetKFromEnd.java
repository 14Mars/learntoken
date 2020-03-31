package testapp1.leet.linklist;


/**
 * 输入一个链表，输出该链表中倒数第k个节点。
 * 为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 */
public class GetKFromEnd {

    public static void main(String[] args) {
        ListNode head = new ListNode(6);


        for (int i = 6; i >= 1; i--) {
            ListNode current = new ListNode(i);
            current.next = head;
            head = current;
        }

        ListNode forIter = head;


        while (head.next != null) {
            System.out.println(head.val);
            head = head.getNext();
        }

        System.out.println(getKthFromEnd(forIter, 2));

//        System.out.println(getLength(forIter));


    }

    public static ListNode getKthFromEnd(ListNode head, int k) {

        ListNode forIter = head;
        int length = getLength(forIter);

        for (int i = 1; i <= length - k; i++) {
            head = head.getNext();
        }


        System.out.println(head.val);
        return head;


    }


    /**
     * 算长度
     * @param head
     * @return
     */
    public static int getLength(ListNode head) {
        int length = 0;
        if (head == null) {
            return length;
        }

        while (head.next != null) {
            length++;
            head = head.getNext();
        }

        return length;
    }


    /**
     * 双链表
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 1; i <= k; i++) {
            fast = fast.getNext();
        }

        while (fast != null && slow != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        return slow;
    }

    /**
     * 双链表
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd3(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        while (k > 0) {
            fast = fast.next;
            k--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }


}
