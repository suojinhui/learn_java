package interfacedemo;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.SCHOOL);
        // 接口不能创建对象
    }
}
// student 称为实现类，实现多个接口
// 必须重写全部接口的抽象方法，否则要申明未抽象类
class Student implements A, B {
    @Override
    public void study() {

    }

    @Override
    public String go() {
        return "";
    }

    @Override
    public void play() {

    }
}
