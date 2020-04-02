package testapp1.leet.stack;


import java.util.Stack;

/**
 * 后缀表达式
 */
public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<String> helper = new Stack<>();

        for (String s : tokens) {
            if (isCalc(s)) {
                //s为计算符号
                String secondValue = helper.pop();
                String firstValue = helper.pop();

                Integer result = doCalc(s, firstValue, secondValue);
                helper.push(result.toString());
            } else {
                //s为数
                helper.push(s);
            }
        }

        return Integer.parseInt(helper.pop());
    }

    boolean isCalc(String s) {
        return s.equals("+")
                || s.equals("-")
                || s.equals("*")
                || s.equals("/");
    }

    Integer doCalc(String calc, String firstValue, String secondValue) {
        Integer first = Integer.parseInt(firstValue);
        Integer second = Integer.parseInt(secondValue);

        switch (calc) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
        }
        return null;
    }
}
