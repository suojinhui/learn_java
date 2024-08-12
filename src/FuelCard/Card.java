package FuelCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String cardId;
    private String name;
    private String phone;
    private double balance; // 余额

    // 预存金额
    public void preload(double money)
    {
        balance += money;
    }

    // 消费金额
    public void consume(double money){
        balance -= money;
    }
}
