package singleinstance;

public class Test {
    public static void main(String[] args) {
        A a = A.getInstance();
        A b = A.getInstance();
        System.out.println(a == b);

    }
}
