import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {

    private static final String INFO = "- enter a number from 1 to 100\n" +
            "- to exit the game, press 0\n" +
            "- for information, enter the command info";

    @Test
    public void testCheckNumber() {
        assertTrue(Main.checkNumber(99));
        assertFalse(Main.checkNumber(101));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("Number: 1", Main.fizzBuzz("1"));
        assertEquals("Number: 56", Main.fizzBuzz("56"));
        assertEquals("Number: 98", Main.fizzBuzz("98"));
        assertEquals("Fizz", Main.fizzBuzz("3"));
        assertEquals("Buzz", Main.fizzBuzz("5"));
        assertEquals("FizzBuzz", Main.fizzBuzz("15"));
    }
}