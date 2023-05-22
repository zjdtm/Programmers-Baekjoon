class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 0;    
        int[] walls = new int[n + 1];
        for(int i = 0; i < section.length; i++) {
            walls[section[i]] = -1;
        }
        
        
        for(int i = 1; i < walls.length; i++) {
            if(walls[i] == -1) {
                i += m - 1;
                answer += 1;
            }
        }
        
        return answer;
    }
}