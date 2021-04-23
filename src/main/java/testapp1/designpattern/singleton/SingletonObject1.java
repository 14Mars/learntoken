package testapp1.designpattern.singleton;


/**
 * 内部静态holder的方式
 */
public class SingletonObject1 {

    private static class SingletonHolder {
        private static SingletonObject1 singletonObject1 = new SingletonObject1();
    }

    private SingletonObject1() {

    }


    public static SingletonObject1 getInstance() {
        return SingletonHolder.singletonObject1;
    }


}
