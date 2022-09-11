package BubbleSortTest;

import SortingAlgorithms.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();
    private int[] arrayToTest = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
    private int[] sorted = {-9, -7, -3, -2, 0, 2, 4, 5, 6, 8};

    @Test
    public void successfullySorted() {
        bubbleSort.bubbleSort(arrayToTest);
        assertArrayEquals(arrayToTest, sorted);

    }

    @Test
    public void failToSort() {
        int[] arrayToTest1 = {10, 2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        int[] sorted1 = {-9, -7, -3, -2, 0, 10, 2, 4, 5, 6, 8};
        bubbleSort.bubbleSort(arrayToTest);
        assertNotEquals(arrayToTest1, sorted1);
    }

}
