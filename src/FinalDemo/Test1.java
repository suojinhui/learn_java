package FinalDemo;

public class Test1 {
    public static void main(String[] args) {
        final int a = 10;
//        a=16; // 无法修改
    }
}

final class A {}
// class B extends A {} // 无法继承

class C {
    public final void f() {}
}

class D extends C {
//    @Override
//    void f() {} // 无法重写
}
