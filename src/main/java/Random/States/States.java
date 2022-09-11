package Random.States;

import java.util.Arrays;

public class States {


    public static void main(String[] args) {


        String[][] data = new String[][]{{"Apples","bannas"},{"bana","grabes"}};
        Arrays.stream(data).forEach(index -> System.out.println(" " + index[0] + " " +  index[1]));

    }
}








