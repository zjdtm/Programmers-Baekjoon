import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = {"zero", "one", "two", "three", "four",
                         "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < words.length; i++) {
            if (s.contains(words[i])) 
                s = s.replaceAll(words[i], i + "");
        }
        
        return Integer.parseInt(s);
    }
}