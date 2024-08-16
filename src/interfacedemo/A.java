package interfacedemo;

public interface A {
    // jdk1.8之前接口中只能定义常量和抽象方法
    // 1.常量，接口定义常量可以省略public static final
    String SCHOOL = "湖南大学";
    // public static final String SCHOOL = "湖南大学";

    // 2.抽象方法，接口定义抽象方法可以省略public abstract
    void study();
    String go();
}
