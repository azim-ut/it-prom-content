package azim;

import itp.algorithm.sort.BubbleSort;
import itp.algorithm.sort.QuickSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SortTests {

    @Test
    public void quickSortTest() {
        QuickSort engine = new QuickSort(new Integer[]{2, 10, 4, 6, 9, 7, 8, 3, 1, 5});
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, engine.sort());
    }

    @Test
    public void bubbleSortTest() {
        BubbleSort engine = new BubbleSort(new Integer[]{2, 10, 4, 6, 9, 7, 8, 3, 1, 5});
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, engine.sort());
    }
}
