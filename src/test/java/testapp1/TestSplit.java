package testapp1;

import com.google.common.base.Splitter;
import com.google.common.io.Files;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by 17031166 on 2018/7/23.
 */
public class TestSplit {

    @Test
    public void test1(){
        File f = new File("D:\\testfiles\\新建文本文档 (4).txt");
        try {
            List<String> fList = Files.readLines(f, Charset.forName("UTF-8"));
            for (String s :fList){
                List<String> names = Splitter.on(",").splitToList(s);
                System.out.println(names.size());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
