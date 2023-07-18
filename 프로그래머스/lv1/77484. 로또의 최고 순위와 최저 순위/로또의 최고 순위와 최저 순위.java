class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] ranking = new int[]{6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];
        int zeroCount = 0;  // 0 갯수
        int winCount = 0;   // 당첨 수

        for(int i : lottos) {
            if(i == 0)
                zeroCount++;
            for(int j : win_nums) {
                if(i == j)
                    winCount++;
            }
        }

        answer[0] = ranking[zeroCount + winCount];
        answer[1] = ranking[winCount];

        return answer;
    }
}