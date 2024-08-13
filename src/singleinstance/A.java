package singleinstance;

public class A {
    // 定义一个静态变量，用于本类的单例，加final修饰符，防止重写,或者私有，写一个调用方法
    private static final A a = new A();
    // 私有化构造方法
    private A(){}

    public static A getInstance(){
        return a;
    }
}
