package ShoppingCenter;

import java.util.HashMap;
import java.util.Map;

public class DeliveryService<T> {
    private HashMap<String, T> productsToDeliver = new HashMap<>();

    public DeliveryService(HashMap<String, T> productsToDeliver) {
        this.productsToDeliver = productsToDeliver;
    }

    public HashMap<String, T> getProductsToDeliver() {
        return productsToDeliver;
    }

    public void setProductsToDeliver(HashMap<String, T> productsToDeliver) {
        this.productsToDeliver = productsToDeliver;
    }
}
