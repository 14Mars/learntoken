package testapp1.learnreflect;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestInvocation {
    public static void main(String[] args) {

        TestInvo proxy01 = (TestInvo) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{TestInvo.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                DefaultTestInvo defaultTestInvo = new DefaultTestInvo();

                System.out.println("before");
                Object result = method.invoke(defaultTestInvo,args);
                System.out.println("after");

                return result;
            }
        });


        proxy01.getInt(1);

    }
}
