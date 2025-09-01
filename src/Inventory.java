import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

    private ArrayList<Product> products = new ArrayList<>();
    private HashMap<Integer, Product> hashMap = new HashMap<>();

    public void addProduct(Product product){
        if(hashMap.putIfAbsent(product.getId(), product) == null){
            products.add(product);
        }
        else{
            Product exists = hashMap.get(product.getId());
            exists.addQuantity(product.getQuantity());
        }
    }

    public void removeProduct(Product product){
        Product exists = hashMap.get(product.getId());
        if(exists == null){
            System.out.println("Error: product not found");
            return;
        }

        products.remove(product);
        hashMap.remove(product.getId(), product);
    }

    public void updateQuantity(int id, int quantity){
        Product exists = hashMap.get(id);
        if(exists == null){
            System.out.println("Error: product not found");
            return;
        }
        exists.addQuantity(quantity);

    }

    public void findProductById(int id){
        Product exists = hashMap.get(id);
        if(exists == null){
            System.out.println("Error: product not found");
            return;
        }

        System.out.println(exists);

    }

    public void showAllProducts(){
        for(Product list: products){
            System.out.println(products);
        }
    }


}
