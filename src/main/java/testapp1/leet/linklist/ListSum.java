package testapp1.leet.linklist;

/**
 * 链表求和
 * 给定两个用链表表示的整数，每个节点包含一个数位。

 这些数位是反向存放的，也就是个位排在链表首部。

 编写函数对这两个整数求和，并用链表形式返回结果。
 */
public class ListSum {


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;

        boolean carry = false;

        while (p1 != null || p2 != null || carry) {
            int val1 = 0;
            int val2 = 0;
            int carryValue = 0;
            if (p1 != null) {
                val1 = p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                val2 = p2.val;
                p2 = p2.next;
            }
            if (carry) {
                carryValue = 1;
            }

            int sum = val1 + val2 + carryValue;
            if (sum >= 10) {
                sum = sum - 10;
                carry = true;
            } else {
                carry = false;
            }

            ListNode current = new ListNode(sum);
            if (head.next == null){
                head.next = current;
                tail = current;
            }else {
                tail.next = current;
                tail = current;
            }
        }

        return head.next;

    }


}
