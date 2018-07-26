package testapp1.leet;

/**
 * 删除列表中的节点，入参只会给出要删除的这个节点
 *
 * 1.至少包含两个节点
 * 节点值唯一
 * 为非末尾节点，并且一定在链表中
 *
 */
public class DeleteNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
