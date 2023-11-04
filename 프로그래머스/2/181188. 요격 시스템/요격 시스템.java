import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        int last = -1;

        Arrays.sort(targets, Comparator.comparingInt(o -> o[1]));

        for (int[] target : targets) {
            if (last == -1) {
                answer++;
                last = target[1] - 1;
                continue;
            }

            if (last >= target[0] && last <= target[1]) continue;

            answer++;
            last = target[1] - 1;
        }

        return answer;
    }
}