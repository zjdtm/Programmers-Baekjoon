import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            int target = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                sets.add(target + numbers[j]);
            }
        }

        return sets.stream().mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}