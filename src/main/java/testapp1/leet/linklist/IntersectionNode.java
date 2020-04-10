package testapp1.leet.linklist;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个链表的交点
 */
public class IntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (headA != null) {
            nodeSet.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (nodeSet.contains(headB)) {
                return headB;
            }
        }

        return null;


    }

}
