import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> students = new ArrayList<>();
        int[] supo1 = new int[]{1, 2, 3, 4, 5};
        int[] supo2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[]{0, 0, 0};

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == supo1[i % supo1.length])
                count[0]++;
            if(answers[i] == supo2[i % supo2.length])
                count[1]++;
            if(answers[i] == supo3[i % supo3.length])
                count[2]++;
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));

        for(int i = 0; i < count.length; i++) {
            if(max == count[i]) {
                students.add(i + 1);
            }
        }

        int[] answer = new int[students.size()];
        for(int i = 0; i < students.size(); i++) {
            answer[i] = students.get(i);
        }

        return answer;
    }
}