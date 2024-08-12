package FuelCard;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard("陕A456789", "索锦辉", "123456789", 5000);
        System.out.println(goldCard);
        SilverCard silverCard = new SilverCard("陕A456789", "张三", "1234522789", 4000);
        System.out.println(silverCard);
        pay(goldCard);
        pay(silverCard);

    }

    // 支付机
    public static void pay(Card card) {
        System.out.println("已刷卡，请输入消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.consume(money);
    }
}
