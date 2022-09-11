package Random.Misc;

import java.util.Random;
import java.util.Scanner;

public class PrintInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array(X): ");
        int a = scanner.nextInt();
        System.out.print("Enter a number to generate the array ranging from 0 - Y: ");
        int b = scanner.nextInt();
        scanner.close();
        Random rand = new Random();
        System.out.println("Creating new array with: " + a + " indexes");
        System.out.println("Printing numbers between: " + 0 + " and " + b);
        int[] numbers = new int[a];
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = rand.nextInt(b);
            System.out.printf("%d ", numbers[i]);
        }
        //  Arrays.stream(numbers).forEach(index -> System.out.print(" " + index));

        System.out.print("\nArray Length: " + numbers.length);
    }
}
