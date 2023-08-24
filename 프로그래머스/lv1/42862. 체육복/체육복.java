import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -100;
                    reserve[j] = -100;
                    break;
                }
            }
        }

        for (int i : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (!(i == reserve[j])) {
                    if ((i + 1) == reserve[j] || (i - 1) == reserve[j]) {
                        answer++;
                        reserve[j] = -100;
                        break;
                    }
                }
            }
        }


        return answer;
    }
}