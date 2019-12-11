package testapp1.learnthread.learnthread3_1;


import com.google.common.collect.Lists;

import java.util.List;

public class Entry {


    public static void main(String[] args) {
        List<String> stringList = Lists.newArrayList();

        ThreadA threadA = new ThreadA(stringList);
        ThreadB threadB = new ThreadB(stringList);
        threadA.start();
        threadB.start();



    }
}
