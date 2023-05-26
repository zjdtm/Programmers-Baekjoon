import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList();

        for (int i = 0; i < 26; i++) {
            queue.add((char) (i + 97));
        }

        for (int i = 0; i < s.length(); i++) {
            char alphabat = s.charAt(i);
            int count = index;

            while (true) {
                if (queue.peek() == alphabat) {
                    char c = ' ';
                    queue.add(queue.poll());
                    while (count != 0) {
                        c = queue.poll();
                        if (!skip.contains(String.valueOf(c))) {
                            count--;
                        }
                        queue.add(c);
                    }
                    sb.append(c);
                    break;
                } else {
                    char poll = queue.poll();
                    queue.add(poll);
                }
            }
        }
        return sb.toString();
    }
}