package testapp1.leet;


public class ReverseString {


    public static String reverseString(String s) {
        char[] chars = s.toCharArray();

        int preIndex = 0;
        int lastIndex = chars.length-1;
        while (preIndex < lastIndex){
            char temp = chars[preIndex];
            chars[preIndex] = chars[lastIndex];
            chars[lastIndex] = temp;
            preIndex++;
            lastIndex--;
        }

        return new String(chars);
    }


    public static void main(String[] args) {

        String test = "hello";
        System.out.println(reverseString(test));
    }


}
