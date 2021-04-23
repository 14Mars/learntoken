package testapp1.learnguava.typetoken;


import com.google.common.reflect.TypeToken;

import java.util.List;

public class LearnTypeToken {


    public static void main(String[] args) {

        TypeToken<String> stringTok = TypeToken.of(String.class);



        TypeToken<List<String>> stringListTok = new TypeToken<List<String>>() {};

    }


//    public




}
