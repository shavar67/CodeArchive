package SortingAlgorithms;

public class SwappingAlgorithm {


    public void swapIndices(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexOne];
        array[indexOne] = temp;
    }
}
