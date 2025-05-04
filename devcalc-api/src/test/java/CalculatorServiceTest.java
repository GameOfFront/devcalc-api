import com.devcalc.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(5.0, service.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(3.0, service.subtract(5, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(12.0, service.multiply(3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(5.0, service.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(5, 0));
    }
}
