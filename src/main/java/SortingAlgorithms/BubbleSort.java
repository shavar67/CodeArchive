package SortingAlgorithms;

public class BubbleSort {


    public  void bubbleSort(int[] arr) {
        int endOfArray = arr.length;
        for (int i = 0; i < endOfArray; i++) {
            for (int j = 1; j < (endOfArray - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }

    }

    public void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }


}

