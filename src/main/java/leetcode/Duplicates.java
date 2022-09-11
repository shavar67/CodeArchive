package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {


    public static int duplicate(String text) {
        int count = 0;
        char[] chars = text.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                count = map.get(c);
                map.put(c, ++count);

            } else {
                map.put(c, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(duplicate("banana"));
    }
}
