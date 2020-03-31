package testapp1.leet.linklist;


public class FirstCommon {
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

//        System.out.println(getKthFromEnd(forIter, 2));

//        System.out.println(getLength(forIter));


    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a


    }




}
