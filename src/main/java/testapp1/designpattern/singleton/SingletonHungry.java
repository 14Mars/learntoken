package testapp1.designpattern.singleton;

/**
 * 初始化加载的方式
 */
public class SingletonHungry {

    private int data;

    private static SingletonHungry instance = new SingletonHungry();


    private SingletonHungry() {
        this.data = 10;

    }

    public static SingletonHungry getInstance() {
        return instance;
    }


}
