package csc424;

public class Orders {

    // Returns subtotal = price * quantity
    public double subtotal(double price, int quantity) {
        return price * quantity;
    }

    // Returns tax amount for given subtotal and taxRate (e.g., 0.08)
    public double tax(double subtotal, double taxRate) {
        return subtotal * taxRate;
    }

    // Returns total = subtotal + tax
    public double total(double subtotal, double tax) {
        return subtotal + tax;
    }
}
