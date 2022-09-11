package SearchingAlgorithms;

public class BinarySearch {


    /**
     *
     * @param list
     * @param key
     *            Binary search is a searching algorithm that replaces the brute
     *            force approach, the algorithm starts at the middle of the array
     *            and compares the midpoint(low index + high index)/2 to the value
     *            being searched for if the midpoint is greater than the value being
     *            searched for, the array can ignore the indices greater than the
     *            midpoint then shift to the left of the midpoint(low indices) so
     *            high = midpoint -1
     *
     *            when the midpoint is less than the value being searched for the
     *            algorithm then begin its search to the right of the midpoint so in
     *            this case (low = midpoint + 1)
     *
     *            after the conditions are tested the we calculate the midpoint of
     *            the sub array thats left to be searched the outer loop (outside of
     *            the while loop) if all conditions fail the algorithm will return a
     *            -1 when a -1 is returned the value was not found in the array.
     *            arrays start counting at 0 so we can't return 0 because the value
     *            being searched for might be at index 0..
     *
     *
     */
    public static int binarySearch(int[] list, int key) {

        int lowIndex = 0;
        int highIndex = list.length - 1;
        int midIndex = (lowIndex + highIndex) / 2;
        while (lowIndex <= highIndex) {
            /**
             * while the low index is less than or equal to the high index we run the following loop.
             * if the middle index is less than the key we shift to the right of the list.
             * then we calculate that midpoint and do our comparison.
             * the low index shifts to the right.
             */
            if (list[midIndex] < key) {
                lowIndex = midIndex + 1;
            } else if (list[midIndex] == key) {
                return midIndex;
                /*
                 * if the value being searched for is found at the midpoint we return the midpoint value
                 * if midpoint is the same as the value being searched for we return the midpoint index.
                 */

            } else {
                /**
                 * if the middle index is greater than the key we shift to the left of the list.
                 * then we calculate that midpoint and do our comparison.
                 * so the high index will shift to the left.
                 */
                highIndex = midIndex - 1;
            }
            /**
             * calculate new midpoint of the sub array
             */
            midIndex = (lowIndex + highIndex) / 2;
        }
        /**
         * value not found so we return a -1
         */
        return -1;

    }
    public static int binarySearchNames(String[] arrayToSearch, String valueToFind) {
        int lowIndex = 0;
        int highIndex = arrayToSearch.length - 1;
        int middleIndex;
        while (lowIndex <= highIndex) {
            middleIndex = (lowIndex + highIndex) / 2;
            if (arrayToSearch[middleIndex].compareTo(valueToFind) < 0) {
                lowIndex = middleIndex + 1;
            } else if (arrayToSearch[middleIndex].compareTo(valueToFind) > 0) {
                highIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }

        return -1;
    }
    public static int[] reverse(int array[]) {

        int[] reversedArray = new int[array.length + 1];
        for (int i = 1; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length - i];
        }
        return reversedArray;
    }
}


