package SortingAlgorithms;

public class InsertionSort {

  /*
     Insertion Sort is not a fast sorting algorithm
     because it uses nested loops to shift items into place
     it is only useful for small datasets
     it runs in 0(n^2)

   */
  public static int[] insertionSort(int[] arrayToSort) {

      int i, j, key, temp;
      for (i = 1; i < arrayToSort.length; i++) {
          key = arrayToSort[i];
          j = i - 1;
          while (j >= 0 && key < arrayToSort[j]) {
              //swap
              temp = arrayToSort[j];
              arrayToSort[j] = arrayToSort[j + 1];
              arrayToSort[j + 1] = temp;
              j--;

          }
      }
      return arrayToSort;
  }

}
