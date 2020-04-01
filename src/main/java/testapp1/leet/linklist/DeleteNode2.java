package testapp1.leet.linklist;


/**
 * 只给定节点，删除该节点
 */
public class DeleteNode2 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
