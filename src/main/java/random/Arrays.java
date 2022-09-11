package leetcode;

import javax.swing.*;
import java.util.Random;

public class Arrays {

    //Demo how to use arrays and their basic functionality
    //How to create an array
    //how to add elements
    //how to access  specific indices
    //how to use for loops with arrays

    //declare the size and the array
    private int Size;
    int [] numbers;

    public Arrays(int size){
        //initialize the array with a size
        this.Size = size;
        numbers = new int[size];

    }


     public void generateArray(){
        Random generator = new Random();

         JOptionPane pane = new JOptionPane("Malicious Attack",JOptionPane.WARNING_MESSAGE);

         for(int i = 0; i < numbers.length;i++){
             numbers[i] = generator.nextInt(10)+1;
             System.out.println( "Index: " + i + ": " + " element: " + numbers[i]);

         }
     }


    public static void main(String[] args) {
        Arrays testArray = new Arrays(20);
     //  testArray.generateArray();
      int[]grades = {70,80,90,96};

        System.out.println(noFs(grades));
    }

    public static boolean noFs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 60) {
                System.out.println("failing");
                return true;

            }
        }
        System.out.println("No Fs");
        return false;

    }
}
