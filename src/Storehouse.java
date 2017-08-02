
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/* @author marbi */
public class Storehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> productStock;

    public Storehouse() {
        this.products = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        if (products.get(product) != null) {
            return products.get(product);
        }

        return -99;
    }

    public int stock(String product) {
        if (productStock.get(product) != null) {
            return productStock.get(product);
        }

        return 0;
    }

    public boolean take(String product) {
        if (productStock.get(product) != null && productStock.get(product) > 0) {
            int temp = productStock.get(product) - 1;
            productStock.put(product, temp);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        Set<String> productNames = new HashSet<String>(products.keySet());

        return productNames;

    }
}
