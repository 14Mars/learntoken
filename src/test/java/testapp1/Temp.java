package testapp1;

import org.apache.tools.ant.util.StringUtils;
import org.junit.Test;


public class Temp {

    @Test
    public void test1(){
        int i = 0;
        int j= 0;

        int k = i^j;

        System.out.println(k);


    }

    @Test
    public void test2(){
        System.out.println(fa(5));
    }

    public long fa(long x){
        if (x==1){
            return 1;
        }

        return fa(x-1)*x;
    }


}
