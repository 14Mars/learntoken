package testapp1.leet.string;

import java.util.Arrays;

/**
 * 替换所有的问号
 */
public class E1576 {


    public static void main(String[] args) {
        E1576 e1576 = new E1576();


    }


    public String modifyString(String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                for (char replaced = 'a'; replaced <= 'c'; replaced++) {
                    if ((i > 0 && charArray[i - 1] == replaced)
                            || (i < charArray.length - 1 && charArray[i + 1] == replaced)) {
                        continue;
                    }
                    charArray[i] = replaced;
                    break;
                }
            }
        }

        return new String(charArray);
    }


}
