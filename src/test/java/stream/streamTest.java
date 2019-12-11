package stream;


import org.testng.annotations.Test;

import java.util.stream.Stream;

public class streamTest {

    @Test
    public void test1() {
        Stream<String> testStream = Stream.generate(()->{
            return "1";
        });


        testStream
                .limit(3)
                .peek(s -> System.out.println("peek"+s))
                .forEach(s->System.out.println(s));
    }


}
