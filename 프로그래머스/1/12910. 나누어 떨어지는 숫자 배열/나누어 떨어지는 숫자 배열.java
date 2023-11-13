import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList();
        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }

        if (answer.size() == 0) {
            return new int[]{ -1 };
        }

        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
}