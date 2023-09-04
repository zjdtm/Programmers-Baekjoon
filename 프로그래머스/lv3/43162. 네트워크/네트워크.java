class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
            boolean[] check = new boolean[n];

            for (int i = 0; i < n; i++) {
                if(!check[i]) {
                    DFS(computers, i, check);
                    answer++;
                }
            }
            return answer;
        }

        void DFS(int [][] computers, int start, boolean[] check) {
            check[start] = true;
            for (int i = 0; i < computers.length; i++) {
                if(computers[start][i] == 1 && !check[i]) {
                    DFS(computers, i, check);
                }
            }
        }
    
}