import java.util.*;
class Solution {
    public String solution(String my_string) {
        Set<Character> used = new HashSet<>();
            
        StringBuilder builder = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            if (used.contains(ch)) {
                continue;
            }
            used.add(ch);
            builder.append(ch);
        }

        return builder.toString();
    }
}