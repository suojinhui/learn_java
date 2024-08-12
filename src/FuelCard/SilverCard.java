package FuelCard;

public class SilverCard extends Card{

    public SilverCard(String cardId, String name, String phone, double balance) {
        super(cardId, name, phone, balance);
    }

    public void consume(double money){
        System.out.println("您当前消费：" + money);
        System.out.println("优惠后的价格为：" + money * 0.9);
        if (this.getBalance() < money * 0.9){
            System.out.println("余额不足，请充值");
        }
        this.setBalance(this.getBalance() - money * 0.9);
    }
}
