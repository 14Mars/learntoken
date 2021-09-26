package testapp1.leet.stack;


import java.util.Stack;

public class TwoStackForQueue {

    Stack<Integer> dataStack;
    Stack<Integer> helpStack;

    public TwoStackForQueue() {
        dataStack = new Stack<>();
        helpStack = new Stack<>();
    }

    public void appendTail(int value) {
        dataStack.push(value);
    }

    public int deleteHead() {
        if (dataStack.isEmpty()){
            return -1;
        }

        while (!dataStack.isEmpty()){
            int value = dataStack.pop();
            helpStack.push(value);
        }

        //delete head
        int head = helpStack.pop();

        while (!helpStack.isEmpty()){
            int value = helpStack.pop();
            dataStack.push(value);
        }

        return head;
    }
}
