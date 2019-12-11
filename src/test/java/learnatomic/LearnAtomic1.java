package learnatomic;


import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicLong;

public class LearnAtomic1 {

    @Test
    public void test1(){
        AtomicLong uniqueIdGenerator = new AtomicLong();
        long a = uniqueIdGenerator.getAndIncrement();

        System.out.println(a);

        a = uniqueIdGenerator.getAndIncrement();
        System.out.println(a);
        a = uniqueIdGenerator.getAndIncrement();
        System.out.println(a);
        a = uniqueIdGenerator.getAndIncrement();
        System.out.println(a);
    }
}
