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

    boolean[] DFS(int [][] computers, int i, boolean[] check) {
        check[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && check[j] == false) {
                check = DFS(computers, j, check);
            }
        }
        return check;
    }
}