package testapp1.leet.linklist;

/**
 * 设计链表
 * index 从0开始
 */
public class MyLinkedList {

    Node dummyHead;
    Node tail;
    int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        dummyHead = new Node(-1);
        tail = dummyHead.next;
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        //第一步保证有值
        Node current = dummyHead.next;

        if (index == 0) {
            return current.value;
        }

        while (index > 0) {
            current = current.next;
            index--;
        }
        return current.value;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node toAdd = new Node(val);
        toAdd.next = dummyHead.next;
        dummyHead.next = toAdd;
        size++;
        if (size == 1) {
            tail = toAdd;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node toAdd = new Node(val);

        if (size == 0) {
            addAtHead(val);
        } else {
            tail.next = toAdd;
            tail = toAdd;
            size++;
        }

    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        if (index < 0 || index > size) {
            return;
        }

        Node toAdd = new Node(val);

        Node current = dummyHead.next;

        while (index > 1) {
            current = current.next;
            index--;
        }
        toAdd.next = current.next;
        current.next = toAdd;
        size++;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (size == 0) {
            return;
        }

        if (index >= size) {
            return;
        }

        if (index == 0) {
            dummyHead.next = dummyHead.next.next;
            size--;
            return;
        }


        Node current = dummyHead.next;
        while (index > 1) {
            current = current.next;
            index--;
        }

        //要注意head 和tail的维护
        if (tail == current.next){
            tail = current;
        }

        current.next = current.next.next;
        size--;
        return;

    }


    class Node {
        Node(int value) {
            this.value = value;
        }

        int value;
        Node next;
    }


    public void print() {
        StringBuilder detail = new StringBuilder("[");

        Node current = dummyHead.next;
        while (current != null) {
            detail.append(current.value);
            detail.append(",");
            current = current.next;
        }

        detail = new StringBuilder(detail.subSequence(0, detail.length() - 1));
        String out = detail.append("]").append("size:").append(size).toString();



        System.out.println(out);

    }


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.print();
        linkedList.addAtHead(84);
        linkedList.print();
        linkedList.addAtTail(2);
        linkedList.print();
        linkedList.addAtTail(39);
        linkedList.print();
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(1));
        linkedList.addAtTail(42);
        linkedList.print();
        linkedList.addAtIndex(1,80);
        linkedList.print();
        linkedList.addAtHead(14);
        linkedList.print();
        linkedList.addAtHead(1);
        linkedList.print();
        linkedList.addAtTail(53);
        linkedList.print();
        linkedList.addAtTail(98);
        linkedList.print();
        linkedList.addAtTail(19);
        linkedList.print();
        linkedList.addAtTail(12);
        linkedList.print();
        System.out.println(linkedList.get(2));
        linkedList.addAtHead(16);
        linkedList.print();
        linkedList.addAtHead(33);
        linkedList.print();
        linkedList.addAtIndex(4,17);
        linkedList.print();
        linkedList.addAtIndex(6,8);
        linkedList.print();
        linkedList.addAtHead(37);
        linkedList.print();
        linkedList.addAtTail(43);
        linkedList.print();
        linkedList.deleteAtIndex(11);
        linkedList.print();
        linkedList.addAtHead(80);
        linkedList.print();
        linkedList.addAtHead(31);
        linkedList.print();
        linkedList.addAtIndex(13,23);
        linkedList.print();
        linkedList.addAtTail(17);
        linkedList.print();
        System.out.println(linkedList.get(4));
        linkedList.addAtIndex(10,0);
        linkedList.print();
        linkedList.addAtTail(21);
        linkedList.print();
        linkedList.addAtHead(73);
        linkedList.print();
        linkedList.addAtHead(22);
        linkedList.print();
        linkedList.addAtIndex(24,37);
        linkedList.print();
        linkedList.addAtTail(14);
        linkedList.print();
        linkedList.addAtHead(97);
        linkedList.print();
        linkedList.addAtHead(8);
        linkedList.print();
        System.out.println(linkedList.get(6));
        linkedList.deleteAtIndex(17);
        linkedList.print();
        linkedList.addAtTail(50);
        linkedList.print();
        linkedList.addAtTail(28);
        linkedList.print();
        linkedList.addAtHead(76);
        linkedList.print();
        linkedList.addAtTail(79);
        linkedList.print();
        System.out.println(linkedList.get(18));
        linkedList.deleteAtIndex(30);
        linkedList.print();
        linkedList.addAtTail(5);
        linkedList.print();
        linkedList.addAtHead(9);
        linkedList.print();
        linkedList.addAtTail(83);
        linkedList.print();
        linkedList.deleteAtIndex(3);
        linkedList.print();
        linkedList.addAtTail(40);
        linkedList.print();
        linkedList.deleteAtIndex(26);
        linkedList.print();
        linkedList.addAtIndex(20,90);
        linkedList.print();
        linkedList.deleteAtIndex(26);
        linkedList.print();
        System.out.println(linkedList.size);
        linkedList.deleteAtIndex(30);
        linkedList.print();

    }
}
