package csc424;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OrdersTest {

    @Test
    public void testSubtotal() {
        OrderCalculator calc = new OrderCalculator();
        assertEquals(40.0, calc.subtotal(10.0, 4), 0.0001);
    }

    @Test
    public void testTax() {
        OrderCalculator calc = new OrderCalculator();
        assertEquals(8.0, calc.tax(100.0, 0.08), 0.0001);
    }

    @Test
    public void testTotal() {
        OrderCalculator calc = new OrderCalculator();
        assertEquals(108.0, calc.total(100.0, 8.0), 0.0001);
    }
}
