import java.util.ArrayList;

public class ShoppingCart {
    Product product;
    int quantity;

    public ShoppingCart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * @param price
     * @return 13% tax amount as per the price received
     */
    double getTax(double price){
        return 0.13*price;
    }

    /**
     * Displays Receipt associated with the Cart
     */
    public void displayReceipt(){
        String name = product.getName();
        double subtotal = product.getPrice()*quantity;
        double tax = getTax(subtotal);
        double total = subtotal+tax;
        System.out.println("******** Receipt ********\n" +
                "Product Name: "+name + "\n"+
                "Subtotal: $"+String. format("%.2f", subtotal)+"\n"+
                "Tax Amount: $"+String. format("%.2f", tax)+"\n"+
                "Final total: $"+String. format("%.2f", total)
        );
    }
}
