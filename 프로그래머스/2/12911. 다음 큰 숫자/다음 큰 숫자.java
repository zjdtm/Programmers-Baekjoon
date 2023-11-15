class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int answer = 0;

        while (true) {
            n++;
            int binaryCount = Integer.bitCount(n);
            if (count == binaryCount) {
                answer = n;
                break;
            }
        }

        return answer;
    }
}