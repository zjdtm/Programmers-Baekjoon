import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        Stack<String> deck1 = new Stack();
        Stack<String> deck2 = new Stack();
        
        for(int i = cards1.length - 1; i >= 0; i--) {
            deck1.push(cards1[i]);
        }
        for(int i = cards2.length - 1; i >= 0; i--) {
            deck2.push(cards2[i]);
        }
        
        String answer = "Yes";
        for(int i = 0; i < goal.length; i++) {
            String word = goal[i];
            
            if(!deck1.isEmpty() && word.equals(deck1.peek())){
                deck1.pop();
            } else if(!deck2.isEmpty() && word.equals(deck2.peek())){
                deck2.pop();
            } else {
                answer = "No";
                break;
            }                 
            
        }
        
        
        return answer;
    }
}