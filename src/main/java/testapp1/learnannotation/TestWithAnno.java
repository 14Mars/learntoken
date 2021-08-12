package testapp1.learnannotation;


public class TestWithAnno {

    @MethodSeq(1)
    public String testMethod(@ParamContextLength("10")@ParamContextRequire(value = true) String input1,
                             @ParamContextRequire(value = true) @ParamContextLength("20") String input2) {
        return input1 + ":" + input2;
    }


}
