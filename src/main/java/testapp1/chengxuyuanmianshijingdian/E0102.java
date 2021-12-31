package testapp1.chengxuyuanmianshijingdian;

/**
 * https://leetcode-cn.com/problems/check-permutation-lcci/
 */
public class E0102 {
    public static void main(String[] args) {
        E0102 e0102 = new E0102();
        String s1 = "abc";
        String s2 = "bca";

        System.out.println(e0102.CheckPermutation(s1, s2));
    }

    public boolean CheckPermutation(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        }
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }

        int j = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(s1.length() - 1 - i);
            if (c1 != c2) {
                return false;
            }
        }

        return true;


    }
}
