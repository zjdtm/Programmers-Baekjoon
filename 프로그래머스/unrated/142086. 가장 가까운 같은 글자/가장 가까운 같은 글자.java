class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
            
        for(int i = 1; i < s.length(); i++) {
            int count = 0;
            for(int j = i - 1; j >= 0; j--) {
                count++;
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = count;
                    break;
                }
            }
        }
        
        return answer;
    }
}