import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;

        for (int[] command : commands) {
            int i = command[0] - 1;
            int j = command[1] - 1;
            int k = command[2] - 1;
            int[] subArr = new int[j - i + 1];
            int subIdx = 0;

            for (int start = i; start <= j; start++) {
                subArr[subIdx++] = array[start];
            }

            Arrays.sort(subArr);

            answer[idx++] = subArr[k];
        }

        return answer;
    }
}