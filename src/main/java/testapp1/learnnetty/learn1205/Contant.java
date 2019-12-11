package testapp1.learnnetty.learn1205;


public class Contant<T extends Contant<T>> {

    private T test1;

    public T getTest1() {
        return test1;
    }

    public void setTest1(T test1) {
        this.test1 = test1;
    }
}
