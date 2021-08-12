package testapp1.learnannotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestAnnoMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        TestWithAnno testWithAnno = new TestWithAnno();
        testWithAnno.testMethod("t1", "t2");

        TestWithAnno reflectObject = TestWithAnno.class.newInstance();

        Method method = TestWithAnno.class.getDeclaredMethod("testMethod", String.class, String.class);
        Annotation[][] annotations = method.getParameterAnnotations();

        System.out.println();



    }
}
