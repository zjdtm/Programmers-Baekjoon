import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int m : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][m - 1] != 0) {
                    int doll = board[i][m - 1];
                    if(basket.isEmpty()) {
                        basket.add(doll);
                    }else {
                        if(basket.peek() == doll) {
                            answer += 2;
                            basket.pop();
                        }else {
                            basket.add(doll);
                        }
                    }
                    board[i][m - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}