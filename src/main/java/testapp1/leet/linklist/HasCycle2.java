package testapp1.leet.linklist;


import java.util.HashSet;
import java.util.Set;

/**
 * 返回环形链表的第一个入环节点
 */
public class HasCycle2 {

    /**
     * 方法1，使用set或者map判断重复
     * @param head
     * @return
     */
    public ListNode hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (nodeSet.contains(current)) {
                return current;
            } else {
                nodeSet.add(current);
                current = current.next;
            }
        }
        return null;
    }










    public ListNode getMeetNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        ListNode faster = head.next.next;
        ListNode slower = head.next;

        while (faster != null && faster.next != null) {
            if (faster == slower) {
                return slower;
            }

            faster = faster.next.next;
            slower = slower.next;
        }
        return null;
    }


    public ListNode getNode(ListNode head){
        ListNode meetNode = getMeetNode(head);

        if (meetNode == null){
            return null;
        }

        ListNode anotherStart = head;

        while (meetNode != anotherStart){
            meetNode = meetNode.next;
            anotherStart = anotherStart.next;
        }
        return anotherStart;





    }




}
