package com.demo.spring.biz.forkjoindemo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForkjoinDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list);

        Iterator<Integer> iter = list.iterator();


        for (int i = 0; i < 100; i++) {
            iter.next();
            if (i % 2 == 0) {
                iter.remove();
            }
        }

        System.out.println(list);


    }


}
