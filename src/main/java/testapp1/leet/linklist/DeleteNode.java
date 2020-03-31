package testapp1.leet.linklist;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * <p>
 * 返回删除后的链表的头节点。
 */
public class DeleteNode {


    public static void main(String[] args) {
        ListNode head = new ListNode(6);

        for (int i = 6; i >= 1; i--) {
            ListNode current = new ListNode(i);
            current.next = head;
            head = current;
        }

        ListNode forIter = head;

        while (forIter.next != null) {
            System.out.println(forIter.val);
            forIter = forIter.getNext();
        }
    }


    /**
     * 常规删除
     * @param head
     * @param val
     * @return
     */
    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode forIter = head;

        //头元素
        if (forIter.val == val) {
            return forIter.next;
        }

        while (forIter.next != null) {
            if (forIter.next.val == val) {
                forIter.next = forIter.next.next;
                break;
            }
            forIter = forIter.next;

        }
        return head;

    }


    /**
     * 双指针
     * @param head
     * @param val
     * @return
     */
    public static ListNode deleteNode2(ListNode head, int val) {
        ListNode dummyHead = head;
        if (head == null){
            return null;
        }
        if (head.val == val){
            return head.next;
        }

        ListNode pre = head;
        ListNode current = head.next;

        while (current != null){
            //找到，删节点，跳出
            if (current.val == val){
                pre.next = current.next;
                break;
            }

            //未找到，指针后移
            pre = pre.next;
            current = current.next;

        }

        return dummyHead;

    }


}
