import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss : sp) {
            sb.append(flag ? ss.toUpperCase() : ss);
            flag = ss.equals(" ");
        }

        return sb.toString();
    }
}