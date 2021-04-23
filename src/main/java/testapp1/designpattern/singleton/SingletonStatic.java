package testapp1.designpattern.singleton;


public class SingletonStatic {

    private static SingletonStatic instance = null;

    static {
        instance = new SingletonStatic();
    }

    private SingletonStatic() {

    }

    public SingletonStatic getInstance() {
        return instance;
    }


}
