class Solution {
    static int answer;
    public int solution(int n) {
        answer = 0;

        for (int i = 1; i <= n; i++) {
            DFS(i, i, n);
        }

        return answer;
    }

    private void DFS(int number, int sum, int result) {

        if (sum > result) {
            return;
        }

        if (result == sum) {
            answer++;
            return;
        }

        DFS(number + 1, sum + number + 1, result);

    }
}