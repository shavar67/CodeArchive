package LinearSearchTest;

import SearchingAlgorithms.LinearSearch;
import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    private LinearSearch linearSearch = new LinearSearch();
   private  int[] arrayToTest = {1, 2, 0, 3, 6, 8, 10, 21};

    @Test
    public void Test() {
        Assert.assertTrue(linearSearch.linearSearch(arrayToTest, 10));
        System.out.println("The length of the array: " + arrayToTest.length );
        System.out.println(firstName + lastName);
    }

    @Test
    public void fail() {
        Assert.assertFalse(linearSearch.linearSearch(arrayToTest, 44));
    }
}
