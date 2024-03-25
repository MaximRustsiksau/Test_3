import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicketPricingTest {

    @Test
    public void testCalculatePrice() {
        assertEquals(20, Main.calculatePrice(40));
    }

    @Test
    public void testCalculateDiscountedPrice() {
        assertEquals(18.0, Main.calculateDiscountedPrice(20, "Warsaw"), 0.001);
        assertEquals(15.0, Main.calculateDiscountedPrice(20, "SomeCity"), 0.001);
    }
}
