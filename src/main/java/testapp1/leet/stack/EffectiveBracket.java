package testapp1.leet.stack;


import java.util.Stack;

public class EffectiveBracket {

    public boolean isValid(String s) {
        //先长度筛选一半
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpen(c)) {
                stack.push(c);
            } else if (isClose(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char toCheck = stack.pop();
                if (!isMatch(toCheck, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    boolean isClose(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    boolean isMatch(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }


}
