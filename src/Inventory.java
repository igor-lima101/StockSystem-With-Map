import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

    private ArrayList<Product> products = new ArrayList<>();
    private HashMap<Integer, Product> hashMap = new HashMap<>();

    public void addProduct(Product product, int quantity){
        if(hashMap.putIfAbsent(product.getId(), product) == null){

        }
    }


}
