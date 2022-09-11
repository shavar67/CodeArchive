package SortingAlgorithms;

public class SelectionSort {

    /*
       Given an array of items
       items will be sorted in increasing order
       Selection sort is not a fast sorting algorithm
       because it uses nested loops to sort, only useful
       for small datasets
       runs in o(n^2)
     */

    public static int [] selectionSort(int [] arrayToSort){
        int i, j, minValue, minIndex, temp = 0;
        for (i = 0; i < arrayToSort.length; i++) {
            minValue = arrayToSort[i];
            minIndex = i;
            for (j = i; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < minValue) {
                    minValue = arrayToSort[j];
                    minIndex = j;
                }
            }
            if (minValue < arrayToSort[i]) {
                temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[minIndex];
                arrayToSort[minIndex] = temp;
            }
        }
        return arrayToSort;
    }

}
