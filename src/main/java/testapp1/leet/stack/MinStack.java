package testapp1.leet.stack;


import java.util.Stack;

public class MinStack {

    Stack<Integer> innerStack = new Stack<>();
    Stack<Integer> minStack
    Integer min = null;


    public MinStack() {

    }

    public void push(int x) {
        if (innerStack.isEmpty()) {
            min = x;
        } else if (min > x) {
            min = x;
        }
        innerStack.push(x);
    }

    public void pop() {


    }

    public int top() {

    }

    public int getMin() {

    }
}
