import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] numbers = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String number : numbers) {
            max = Math.max(Integer.parseInt(number), max);
            min = Math.min(Integer.parseInt(number), min);
        }

        return sb.append(min).append(" ").append(max).toString();
    }
}