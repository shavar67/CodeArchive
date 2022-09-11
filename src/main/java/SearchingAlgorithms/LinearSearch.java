package SearchingAlgorithms;



public class LinearSearch {
    /* o(n) -> Linear time
       The Linear search have a run time complexity of 0(n) worst case scenario
       this means that the performance of the linear search algorithm grows
       linear and in direct proportion to the size of the data set

     */

    public boolean linearSearch(int[] arrays, int valueToSearch) {
        boolean isFounded = false;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == valueToSearch) {
                isFounded = true;
                System.out.println("The searched value of: " + arrays[i] + " was found at index: " + i);
            }
        }
        return isFounded;
    }

}
