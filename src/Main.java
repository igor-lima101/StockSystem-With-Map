//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Inventory inventory = new Inventory();

        Product product = new Product(1, "Arroz", 20, 10.0);
        Product product1 = new Product(2, "Veja", 5, 5.0);

        inventory.addProduct(product);
        inventory.addProduct(product1);
        inventory.showAllProducts();

        System.out.println("-------------");
        System.out.println("FIND PRODUCT BY ID: ---");
        inventory.findProductById(product1.getId());

        System.out.println("-------------");
        System.out.println("UPDATE QUANTITY: ---");
        inventory.updateQuantity(product1.getId(), 5);

        inventory.showAllProducts();

        System.out.println("-------------");
        System.out.println("REMOVE PRODUCT: ---");
        inventory.removeProduct(product.getId());

        System.out.println("UPDATE LIST, WITHOUT PRODUCT1: ---");
        inventory.showAllProducts();


    }
}