package testapp1.leet;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;



        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode currentSumNode = null;
            ListNode sumHead = currentSumNode;

            ListNode currentL1 = l1;
            ListNode currentL2 = l2;

            boolean carry = false;//进位

            while (currentL1 != null || currentL2 != null) {
                int currentSum = 0;
                if (currentL1 != null) {
                    currentSum += currentL1.val;
                }

                if (currentL2 != null) {
                    currentSum += currentL2.val;
                }

                if (carry) {
                    currentSum += 1;
                }

                //处理进位
                if (currentSum >= 10) {
                    currentSum -= 10;
                    carry = true;
                } else {
                    carry = false;
                }

                ListNode newSum = new ListNode(currentSum);


                if (currentL1 != null) {
                    currentL1 = currentL1.next;
                }
                if (currentL2 != null) {
                    currentL2 = currentL2.next;
                }


                if (sumHead == null) {
                    currentSumNode = newSum;
                    sumHead = currentSumNode;
                } else {
                    currentSumNode.next = newSum;
                }


                currentSumNode = currentSumNode.next;


            }

            if (carry) {
                currentSumNode.next = new ListNode(1);
            }

            return sumHead;


        }
    }

}
