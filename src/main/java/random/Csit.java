package leetcode;


import java.util.Random;

public class Csit {


    public static void main(String[] args) {

        Csit csit = new Csit();
       // System.out.println(csit.total(4, 6));
        Random gen = new Random();
        int ran = gen.nextInt(5) + 1 ;
        //System.out.println(ran);
        System.out.println(csit.addDown(5));


    }

    public int total(int start, int finish) {
        int sum = 0;
        // assign counter to start
        int counter = start;
        // while counter is less than equal to finish(inclusively)
        while (counter <= finish) {
            sum += counter;
            counter += 1;
            //for every iteration add the value of counter to sum.
            //so first ASSIGN THE CURRENT VALUE OF COUNTER TO SUM SO SUM = 4

            /*
            (SUM += COUNTER) IS THE SAME AS (SUM = SUM + COUNTER)
            IS 4 < 6 ? YES SO SUM = 4
            IS 5 < 6 ? YES SO SUM = 9  < 5 + 4 >
            IS  6 <= 6? YES SO SUM = 15 < 9 + 6 >
            SO TO AVOID AN INFINITE LOOP WE INCREMENT THE COUNTER BY ONE EACH ITERATION


             */


        }
        return sum;
    }

    public int addDown(int num) {
        int sum = 0;
        //check to see if the number is positive
        if (num > 0) {
            //loop from 0 to the number that's passed in,
            // add the number each iteration to the the sum variable
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
        }
        //return the sum
        return sum;
    }

    public int countEvens(int[] nums) {
        int num = 0;
        for (int number : nums) {
            if (number % 2 == 0) {
                num++;
            }
        }
        return num;
    }

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }
}
