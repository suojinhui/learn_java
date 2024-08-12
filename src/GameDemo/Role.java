package GameDemo;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char sex;

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                '}';
    }

    //攻击
    public void attack(Role role){
        Random r = new Random();
        int attack_blood = r.nextInt(100)+1;
        int now_blood = role.getBlood() - attack_blood;
        now_blood = Math.max(now_blood, 0);
        role.setBlood(now_blood);
        System.out.println(this.name+"举起拳头，打了"+role.getName()+"一下,"+"造成了"+attack_blood+"点伤害,"+role.name+"还剩下了"+
                role.getBlood()+"点血量");
    }

}
