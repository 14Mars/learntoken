package testapp1.dal;


public class App {

    public static void main(String[] args) {
        App2 app2=new App2();
    }

    int a =110;//Foo的成员变量
    public App() {
        System.out.println("我是父类的构造方法");
        add();
    }
    public void add() {
        System.out.println("调用我了吗？");
        a++;
        System.out.println(a);
    }

}

class App2 extends App{
    int a =100;
    public App2() {
        System.out.println(a);
    }
    public void add() {
        System.out.println("重写了父类的add方法");
        System.out.println(a);
        a++;
        System.out.println(a);
    }
}
