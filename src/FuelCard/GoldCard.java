package FuelCard;

public class GoldCard extends Card{

    public GoldCard(String cardId, String name, String phone, double balance) {
        super(cardId, name, phone, balance);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前消费：" + money);
        System.out.println("优惠后的价格为：" + money * 0.8);
        if (this.getBalance() < money * 0.8) {
            System.out.println("您的余额不足，请先充值。");
            return;
        }
        this.setBalance(this.getBalance() - money * 0.8);
        if(money*0.8 > 200){
            printTicket();
        }
        else
        {
            System.out.println("您消费不满200元，没有获得洗车票。");
        }

    }

    // 打印洗车票
    public void printTicket() {
        System.out.println("您消费了" + this.getBalance() + "元，获得一张洗车票。");
    }
}
