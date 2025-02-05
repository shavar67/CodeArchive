package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    /*
    given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    Example:
    Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
     public int reverse(int x) {

        String num = Integer.toString(x);
        int con =  Integer.parseInt(String.valueOf(new StringBuffer(num).reverse()));
       return con;
    }
    public static int reverseOptimal(int inputNumber) {
        long reverseInteger = 0;

        while (inputNumber != 0) {
            reverseInteger = (reverseInteger * 10) + (inputNumber % 10);
            inputNumber = inputNumber / 10;

            // whenever overflow occurs, return 0
            if (reverseInteger > Integer.MAX_VALUE || reverseInteger < Integer.MIN_VALUE)
                return 0;
        }
        return (int) reverseInteger;
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length -1;
         if(digits.length == 0)
             return digits;
       for(int i = 0; i < digits.length;i++){

           digits[digits.length-1] += 1;
           System.out.println(digits[i]);
       }



        return digits;
    }


    public int Square(int num) {

        return (int) Math.floor(Math.sqrt(num));
    }

    boolean isPowerOfFour(long n) {
        int count = 0;
        for (int i = 2; i <= 32; i = i + 2) {
            if (n == 1 << i) {
                count++;
                break;
            }
        }
        return count == 1;
    }

}
