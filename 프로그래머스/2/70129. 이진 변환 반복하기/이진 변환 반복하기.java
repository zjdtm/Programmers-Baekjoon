import java.util.*;
class Solution {
    public int[] solution(String s) {
        StringBuilder sb;
        int count = 0;
        int deleteZeroCount = 0;

        while(!s.equals("1")) {
            sb = new StringBuilder();
            count++;

            for (char c : s.toCharArray()){
                if (c == 48) deleteZeroCount++;
                else sb.append(c);
            }

            s = Integer.toString(sb.length(), 2);
        }

        return new int[]{count, deleteZeroCount};
    }
}