import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {
    private BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    @Test
    public void testCountInput1() {
        String input = "aabbabcccba";
        int expected = 28;
        assertEquals(expected, balancedWordsCounter.count(input));
    }

    @Test
    public void testCountInput2() {
        String input = "";
        int expected = 0;
        assertEquals(expected, balancedWordsCounter.count(input));
    }

    @Test(expected = RuntimeException.class)
    public void testCountInput3() {
        String input = "abababa1";
        balancedWordsCounter.count(input);
    }

    @Test(expected = RuntimeException.class)
    public void testCountInput4() {
        String input = null;
        balancedWordsCounter.count(input);
    }
}
