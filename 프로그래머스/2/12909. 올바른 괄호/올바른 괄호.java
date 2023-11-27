import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
            
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' : {
                    stack.push(c);
                    break;
                }
                case ')' : {
                    if (stack.isEmpty()) return false;
                    stack.pop();
                    break;
                }
            }
        }

        return stack.isEmpty();
    }
}