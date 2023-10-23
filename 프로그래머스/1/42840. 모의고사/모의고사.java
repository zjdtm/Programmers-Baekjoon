import java.util.*;

class Solution {
    private static final int[][] RULES = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        private int getPicked(int person, int problem) {
            int[] rule = RULES[person];
            int index = problem % rule.length;
            return rule[index];
        }

        public int[] solution(int[] answers) {
            int[] corrects = new int[3];
            int max = 0;

            for (int problem = 0; problem < answers.length; problem++) {
                int answer = answers[problem];

                // 각 수포자별로 정답 개수 세기
                for (int person = 0; person < 3; person++) {
                    int picked = getPicked(person, problem);
                    if (answer == picked) {
                        if (++corrects[person] > max) {
                            max = corrects[person];
                        }
                    }
                }
            }
            final int maxCorrects = max;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < corrects.length; i++) {
                if (maxCorrects == corrects[i]) {
                    list.add(i + 1);
                }
            }
            int[] answer = new int[list.size()];
            int cnt = 0;
            for (int num : list) {
                answer[cnt++] = num;
            }
            return answer;
        }
}