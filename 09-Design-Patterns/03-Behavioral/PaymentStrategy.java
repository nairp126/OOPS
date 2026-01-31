// Package removed to match directory structure

// 1. The Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// 2. Concrete Strategy A
class CreditCardStrategy implements PaymentStrategy {
    private String name;

    public CreditCardStrategy(String name) {
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Credit Card (" + name + ")");
    }
}

// 3. Concrete Strategy B
class PayPalStrategy implements PaymentStrategy {
    private String email;

    public PayPalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal (" + email + ")");
    }
}

// 4. The Context (Shopping Cart)
class ShoppingCart {
    // The cart doesn't care HOW you pay, just that you HAVE a strategy.
    public void checkout(int amount, PaymentStrategy paymentMethod) {
        paymentMethod.pay(amount);
    }
}

/**
 * Strategy Pattern.
 * 
 * Problem: Avoid large if-else blocks like "if (type == CREDIT) { ... } else if
 * (type == PAYPAL) { ... }"
 * Solution: Pass the behavior (Strategy) as an object.
 */
class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with Card
        cart.checkout(100, new CreditCardStrategy("Alice"));

        // Pay with PayPal (Swapping logic at runtime!)
        cart.checkout(250, new PayPalStrategy("alice@example.com"));
    }
}
