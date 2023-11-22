class Solution {
    public int solution(int[] numbers) {
        // 1 ~ 9 까지의 합은 45
        int answer = 45;

        for (int i : numbers) {
            answer -= i;
        }

        return answer;
    }
}