import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            int count = 0;
            for (char ch : chars) {
                if (ch == 48 || ch == 53) {
                    count++;
                }
            }
            if (chars.length == count) {
                arr.add(i);
            }
        }

        int[] answer = new int[arr.size()];
        if (arr.isEmpty()) {
            return new int[]{-1};
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}