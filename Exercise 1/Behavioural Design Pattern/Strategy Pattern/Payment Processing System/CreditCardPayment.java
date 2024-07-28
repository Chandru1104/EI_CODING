// PaymentStrategy.java


// CreditCardPayment.java
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;
    private String cvv;

    public CreditCardPayment(String cardNumber, String name, String cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}

// PayPalPayment.java

// BitcoinPayment.java


// ShoppingCart.java


// Item.java


// StrategyPatternDemo.java
