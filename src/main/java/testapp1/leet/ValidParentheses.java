package testapp1.leet;

/**
 * Created by bao on 2018/7/26.
 */
public class ValidParentheses {


    public boolean isValid(String s) {

        char[] chars = s.toCharArray();

        char[] temp = new char[chars.length];
        int stackIndex = -1;

        for (char aChar : chars) {
            if (stackIndex >= 0 && isPair(aChar, temp[stackIndex])) {
                stackIndex--;
            } else {
                stackIndex++;
                temp[stackIndex] = aChar;
            }
        }
        return stackIndex == -1;
    }

    boolean isPair(char candidate, char toPair) {
        switch (candidate) {
            case '}':
                return toPair == '{';
            case ']':
                return toPair == '[';
            case ')':
                return toPair == '(';
            default:
                return false;
        }
    }

}
