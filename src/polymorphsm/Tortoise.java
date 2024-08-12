package polymorphsm;

public class Tortoise extends Animal{
    public String name = "乌龟";
    @Override
    public void run() {
        System.out.println("我是乌龟，跑的很慢···");
    }
    public void eatcao()
    {
        System.out.println("我是乌龟，吃草···");
    }
}
