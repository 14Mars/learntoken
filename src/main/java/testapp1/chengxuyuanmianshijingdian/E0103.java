package testapp1.chengxuyuanmianshijingdian;

/**
 * https://leetcode-cn.com/problems/string-to-url-lcci/
 */
public class E0103 {
    public static void main(String[] args) {
        E0103 e0103 = new E0103();
        String input = "               ";
        int length = 5;
        String output = e0103.replaceSpaces2(input, length);
        System.out.println(output);
    }


//    public String replaceSpaces(String s, int length) {
//        if (s == null || s.length() == 0 || length == 0) {
//            return "";
//        }
//
//        char space = ' ';
//
//        char[] source = s.toCharArray();
//        for (int i = 0; i < length; i++) {
//            if (source[i] == ' ') {
//
//            }
//        }
//
//
//    }


    /**
     * 直接使用api
     * 注意一开始给的字符串是超长的。需要先按指定的长度substring，再replace
     *
     * @param s
     * @param length
     * @return
     */
    public String replaceSpaces1(String s, int length) {
        if (s == null || s.length() == 0 || length == 0) {
            return "";
        }
        return s.substring(0, length).replaceAll(" ", "%20");
    }

    /**
     * 如果可以使用额外的空间
     *
     * @param s
     * @param length
     * @return
     */
    public String replaceSpaces2(String s, int length) {
        int lengthEst = length * 3;
        char[] target = new char[lengthEst];
        int targetIndex = 0;
        char[] source = s.toCharArray();

        for (int sourceIndex = 0; sourceIndex < length; sourceIndex++) {
            if (source[sourceIndex] == ' ') {
                target[targetIndex++] = '%';
                target[targetIndex++] = '2';
                target[targetIndex++] = '0';
            } else {
                target[targetIndex++] = source[sourceIndex];
            }
        }

        return String.valueOf(target).substring(0, targetIndex);
    }


}
