package testapp1.chengxuyuanmianshijingdian;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class E0101 {

    public static void main(String[] args) {
        E0101 e0101 = new E0101();
        String input = "abcc";
        System.out.println(e0101.isUnique3(input));
    }


    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet();
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            set.add(c);
        }

        if (set.size() == astr.length()) {
            return true;
        } else {
            return false;
        }


    }


    public boolean isUnique2(String astr) {
        Set<Character> set = new HashSet(astr.length());
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }


    public boolean isUnique3(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            for (int j = i + 1; j < astr.length(); j++) {
                if (astr.charAt(i) == astr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isUnique4(String astr) {
        int aa = 0;
        int cc = 1;
        for (int i = 0; i < astr.length(); i++) {
            char t = astr.charAt(i);
            int offset = t - 'a';

            int bb = cc << offset;
            if ((aa & bb) != 0) {
                return false;
            }
            aa |= bb;

        }
        return true;
    }


}
