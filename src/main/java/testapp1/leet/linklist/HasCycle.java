package testapp1.leet.linklist;




public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }

        ListNode faster = head.next.next;
        ListNode slower = head.next;

        while (faster != null && faster.next != null) {
            if (faster == slower) {
                return true;
            }

            faster = faster.next.next;
            slower = slower.next;
        }
        return false;
    }
}
