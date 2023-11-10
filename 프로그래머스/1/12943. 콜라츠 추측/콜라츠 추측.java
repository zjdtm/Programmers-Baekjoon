class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;

        if (n == 1) {
            return 0;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                n = n * 3 + 1;
            } else {
                n /= 2;
            }
            answer++;
            if (answer == 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}