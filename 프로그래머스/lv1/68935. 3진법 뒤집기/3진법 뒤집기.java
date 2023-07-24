import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while(n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

        int len = 0;
        for(int i = sb.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(sb.substring(i, i + 1)) * Math.pow(3, len);
            len += 1;
        }

        return answer;
    }
}