package day11.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // 目标：掌握HashSet集合去重操作。
        Student s1 = new Student("张三", 18, "北京", "123456");
        Student s2 = new Student("李四", 19, "上海", "989876");
        Student s3 = new Student("张三", 18, "北京", "123456");
        Student s4 = new Student("李四", 19, "上海", "989876");

        Set<Student> set = new HashSet<>(); // 不重复的！
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        Set<Teacher> set2 = new HashSet<>();
        set2.add(new Teacher("张三", 18, 10000));
        set2.add(new Teacher("李四", 19,  20000));
        System.out.println(set2);

        System.out.println(set);
    }
}
