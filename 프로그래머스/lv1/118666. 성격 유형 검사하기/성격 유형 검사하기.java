import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Character[] characters = new Character[]{'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int[] score = new int[] {3, 2, 1, 0, 1, 2, 3};
        Map<Character, Integer> map = new HashMap<>();
        for(char c : characters) {
            map.put(c, 0);
        }

        for (int i = 0; i < choices.length; i++) {
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            int c = choices[i];
            int choice = score[c - 1];
            if (c <= 3) {
                int n = map.get(c1);
                map.replace(c1, n + choice);
            } else if (c == 4) {
                continue;
            } else {
                int n = map.get(c2);
                map.replace(c2, n + choice);
            }
        }

        for(int i = 0; i < characters.length; i+=2) {
            int first = map.get(characters[i]);
            int second = map.get(characters[i + 1]);
            if(first > second) {
                answer.append(characters[i]);
            }else if(first < second) {
                answer.append(characters[i + 1]);
            }else {
                int r = characters[i] - characters[i + 1];
                answer.append(r > 0 ? characters[i + 1] : characters[i]);
            }
        }

        return answer.toString();
    }
}