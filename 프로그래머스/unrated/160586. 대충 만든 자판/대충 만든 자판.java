import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap();
        
        for(String key : keymap) {
            for(int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                if(!map.containsKey(c) || i < map.get(c))
                    map.put(c, i + 1);
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            char[] target = targets[i].toCharArray();
            int count = 0;
            for(int j = 0; j < target.length; j++) {
                char c = target[j];
                if(!map.containsKey(c)) {
                    count = -1;
                    break;                    
                }else {
                    count += map.get(c);
                }
            }
            answer[i] = count == -1 ? -1 : count;        
        }    
        return answer;
    }
}