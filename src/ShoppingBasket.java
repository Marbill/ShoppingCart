
import java.util.HashMap;
import java.util.Map;


/* @author marbi */
public class ShoppingBasket {

    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {

        if (purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
            purchases.get(product).setUnitPrice(purchases.get(product).getUnitPrice() + price);

        } else {
            Purchase p = new Purchase(product, 1, price);
            purchases.put(product, p);
        }
    }

    public int price() {
        int total = 0;

        for (Purchase p : purchases.values()) {
            total += p.getUnitPrice();
        }

        return total;

    }

    public void print() {
        for (Purchase p : purchases.values()) {
            System.out.println(p.getProduct() + ": " + p.getAmount());
        }
    }

}
