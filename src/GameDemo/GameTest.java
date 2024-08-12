package GameDemo;

public class GameTest {
    public static void main(String[] args) {
        //创建角色
        Role r1 = new Role("索锦辉", 500);
        Role r2 = new Role("余曹曹", 500);

        System.out.println(r1);
        System.out.println(r2);
        //回合制游戏
        while(true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }

        }
    }
}
