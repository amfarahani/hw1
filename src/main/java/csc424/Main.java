package csc424;

public class Main {
    public static void main(String[] args) {
        OrderCalculator calc = new OrderCalculator();
        double sub = calc.subtotal(19.99, 2);
        double tax = calc.tax(sub, 0.08);
        double total = calc.total(sub, tax);

        System.out.println("Subtotal: " + sub);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }
}
