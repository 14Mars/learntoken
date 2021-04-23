package testapp1.leet.linklist;


public class E206ReverseLinklist {

    public static void main(String[] args) {

    }

    public ListNode reverseListResc(ListNode head) {



        return null;
    }


    /**
     * @param head
     * @return
     */
    public ListNode reverseListLoop(ListNode head) {
        //空场景
        if (head== null){
            return null;
        }

        //反转后的dummy head
        ListNode dummyNewHead = new ListNode(0);
        dummyNewHead.next=null;

        //当前待处理节点
        ListNode currentNode = head;

        ListNode tmp;

        while (currentNode.next != null){
            //暂存
            tmp = currentNode.next;

            //将当前节点插入到头结点
            currentNode.next=dummyNewHead.next;
            dummyNewHead.next=currentNode;

            currentNode = tmp.next;


        }


        //返回反转后的第一个节点
        return dummyNewHead.next;
    }


}
