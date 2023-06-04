import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
            Queue<Integer> queue = new PriorityQueue<>();

            for(int i = 0; i < answer.length; i++) {
                if(queue.size() < k) {
                    queue.add(score[i]);
                }else if(score[i] > queue.peek()){
                    queue.poll();
                    queue.add(score[i]);
                }
                answer[i] = queue.peek();
            }
            return answer;
    }
}