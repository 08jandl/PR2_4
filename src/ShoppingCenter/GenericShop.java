package ShoppingCenter;

import java.util.HashMap;
import java.util.Map;

public class GenericShop<T> {
    private final String name;

    private HashMap<String, T> products = new HashMap<>();

    public GenericShop(String name, HashMap<String, T> products) {
        this.name = name;
        this.products = products;
    }

    public void addProductsFromDelivery (HashMap<String, T> deliveredProducts) {
        // transfer all the products from the deliveryService HashMap into the shop's HashMap
        products.putAll(deliveredProducts);
        // since products are delivered, the deliveryService shouldn't have any more products left -> clear
        deliveredProducts.clear();
    }

    // simple removal of a specific product from the shop's inventory (i.e. the HashMap) by key
    public void sellAProduct(String productName) {
        products.remove(productName);
    }

    public void showProducts() {
        // Imagining a sales scenario, we want to be extra friendly
        System.out.println("Welcome to " + name);
        // We are also considering that there are not products yet (before delivery) or none anymore (sold out). Either way, sold out sounds better ot a potential customer
        if (products.isEmpty()) {
            System.out.println("Sorry, we're already sold out for today.");
        } else {
            // if there are products we can show, that's what we do here via the loop going over our HashMap
            System.out.println("These are our available products: ");
            for (String key : products.keySet()) {
                System.out.println(key);
            }
        }
    }

}
