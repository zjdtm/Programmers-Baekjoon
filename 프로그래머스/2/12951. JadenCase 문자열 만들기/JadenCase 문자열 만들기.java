import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];

            if (arr[i].length() == 0) {
                sb.append(" ");
            } else {
                sb.append(now.substring(0, 1).toUpperCase())
                        .append(now.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        if (s.endsWith(" ")) {
            return sb.toString();
        }

        return sb.toString().trim();
    }
}