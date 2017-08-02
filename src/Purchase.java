
import java.util.HashMap;
import java.util.Map;


/* @author marbi */
public class Purchase {

    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int getAmount() {
        return amount;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }    
    
    public int price() {
        return this.amount * this.unitPrice;
    }

    public void increaseAmount() {
        this.amount++;
    }

    public String toString() {
        return this.product + ": " + this.amount;
    }

}