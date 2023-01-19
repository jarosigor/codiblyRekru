import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSortInput1() {
        List<Comparable> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> expected = Arrays.asList(1, 3, 4, 5, 6, 8, 8);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSortInput2() {
        List<Comparable> input = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Comparable> expected = Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSortInput3() {
        List<Comparable> input = Arrays.asList();
        List<Comparable> expected = Arrays.asList();
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSortInput4() {
        List<Comparable> input = Arrays.asList(null, 5.0001);
        List<Comparable> expected = Arrays.asList(5.0001);
        assertEquals(expected, bubbleSort.sort(input));
    }

    @Test(expected = RuntimeException.class)
    public void testSort_input5() {
        List<Comparable> input = null;
        bubbleSort.sort(input);
    }
}

