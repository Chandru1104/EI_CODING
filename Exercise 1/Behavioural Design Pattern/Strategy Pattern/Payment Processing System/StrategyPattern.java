public class StrategyPattern{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Laptop", 1000);
        Item item2 = new Item("Smartphone", 500);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay with credit card
        cart.pay(new CreditCardPayment("1234567890123456", "John Doe", "123"));

        // Pay with PayPal
        cart.pay(new PayPalPayment("john@example.com", "password"));

        // Pay with Bitcoin
        cart.pay(new BitcoinPayment("1FfmbHfnpaZjKFvyi1okTjJJusN455paPH"));
    }
}
