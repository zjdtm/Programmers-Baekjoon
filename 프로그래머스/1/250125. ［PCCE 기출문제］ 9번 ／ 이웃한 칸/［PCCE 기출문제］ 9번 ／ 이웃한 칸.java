class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        int maxLength = board.length;
        
        String targetColor = board[h][w];
        
        for (int i = 0; i < 4; i++) {
            int dx = h + dh[i];
            int dy = w + dw[i];
            
            if (dx < maxLength && dx >= 0 
                && dy < maxLength && dy >= 0) {
                String checkColor = board[dx][dy]; 
                if (checkColor.equals(targetColor)) answer++;
            }
            
        }
        return answer;
    }
}