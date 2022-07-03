import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {

    @Test
    public void testCheckNumber() {
        assertTrue(Main.checkNumber(99));
        assertFalse(Main.checkNumber(101));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz", Main.fizzBuzz("3"));
        assertEquals("Buzz", Main.fizzBuzz("5"));
        assertEquals("FizzBuzz", Main.fizzBuzz("15"));
    }
}