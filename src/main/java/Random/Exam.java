package Random;

public class Exam {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println("Current iteration of i: " + i  + ",  j =  " +  j ) ;

            }
            System.out.println("\nexits innerLoop, condition is met when j-1 = 0\nOuterLoop now increment by 1 until outerLoop condition is false\n\n");
        }
        System.out.println("\t\t\t\t---- Example When i = 4 ----\n");
        System.out.println("i = 4\nj = 4, is 4 > 0? yes -> print(4)\ndecrement by 1\nj = 3, is 3 > 0? yes -> print(3)\ndecrement by 1 \nj = 2, is 2 > 0? yes print(2) \ndecrement by 1\nj = 1, is 1 > 0? yes print(1) \ndecrement by 1\nj = 0\n0 > 0? no exit and increment i by 1");

    }
}
