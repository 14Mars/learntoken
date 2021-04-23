package testapp1.leet.string;


public class E14LongestCommonPrefix {


    public static void main(String[] args) {

    }


    //方法1，两两比较
    public String longestCommonPrefix01(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int i = 1;
        String tempLcp = strs[0];

        while (i < strs.length) {
            tempLcp = longestCommonPrefixFor2(tempLcp, strs[i]);
            i++;
        }

        return tempLcp;

    }


    public String longestCommonPrefixFor2(String str1, String str2) {
        String lcp = "";
        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 == c2) {
                lcp = lcp + c1;
            } else {
                return lcp;
            }
            i++;
        }

        return lcp;
    }


    /*-------------*/
    //方法1，两两比较,调整一下
    public String longestCommonPrefix02(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String tmpLcp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            tmpLcp = longestCommonPrefixFor2v2(tmpLcp,strs[i]);
            if (tmpLcp.length() == 0){
                break;
            }
        }

        return tmpLcp;
    }

    public String longestCommonPrefixFor2v2(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) != str2.charAt(i)) {
                //跳出时为i，str i是不相等的
                break;
            }
            i++;
        }

        //前闭后开
        return str1.substring(0, i);
    }


}
