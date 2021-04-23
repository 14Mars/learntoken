package testapp1.leet.digui;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] input = "helloworld".toCharArray();
//        String inputString = "helloworld";
//        String out = reverseString(inputString);

        reverseInChar(input, 0,input.length-1);
        System.out.println(input);


    }


    public static String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.length() == 1) {
            return str;
        }

        str = reverseString(str.substring(1)) + str.charAt(0);
        return str;

    }


    public static void reverseInChar(char[] input, int start, int end) {
        if (start > input.length || start < 0) {
            return;
        }
        if (end > input.length || end < 0) {
            return;
        }


        if (start > end) {
            return;
        }

        char tmp = input[start];
        input[start] = input[end];
        input[end] = tmp;
        reverseInChar(input, start + 1, end - 1);
        return;

    }


}
