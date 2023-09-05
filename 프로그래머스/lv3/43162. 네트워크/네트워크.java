class Solution {
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                answer++;
                DFS(computers, i);
            }
        }
        
        return answer;
    }
    
    void DFS(int[][] computer, int start) {
        visited[start] = true;
        
        for (int i = 0; i < computer[0].length; i++) {
            if (!visited[i] && computer[start][i] == 1) {
                DFS(computer, i);
            }
        }
    }
}