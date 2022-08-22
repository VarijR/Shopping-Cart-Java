public class Main {
    public static void main(String[] args) {
        //Create a Product Object.
        Product product = new Product("Jacket","Stuff: Denim",120.23);

        //Create a cart object and pass product as a parameter and value 5.
        ShoppingCart cart = new ShoppingCart(product,5);

        //this method displays receipt for the cart products.
        cart.displayReceipt();
    }
}
