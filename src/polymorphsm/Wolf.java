package polymorphsm;

public class Wolf extends Animal {
    public String name = "狼";
    @Override
    public  void run(){
        System.out.println("我是狼，跑的很快···");
    }

    public void eatsheep(){
        System.out.println("我是狼，吃羊···");
    }
}
