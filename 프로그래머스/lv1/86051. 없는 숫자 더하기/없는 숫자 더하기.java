import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String s_numbers = Arrays.toString(numbers);

        for(int i = 0; i <= 9; i++) {
            String number = String.valueOf(i);
            if(!s_numbers.contains(number))
                answer += i;
        }

        return answer;
    }
}