import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int[] dx = {0, 1, 0, -1};    // 위, 오른쪽, 왼쪽, 아래 방향으로 움직이기 위한 방향표
    static int[] dy = {1, 0, -1, 0};
    static int[][] maze;                // N * M 크기의 배열 미로
    static boolean[][] visited;             // 방문했던 곳을 체크하기 위한 배열
    static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];       // 미로 N * M 크기로 초기화
        visited = new boolean[N][M];    // 방문 배열 N * M 크기로 초기화


        /*
            maze 의 값을 채워주는 로직
         */
        for(int i = 0; i < N; i++) {
            String[] line = br.readLine().split("");
            for(int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(line[j]);
            }
        }

        BFS(0, 0);
        System.out.println(maze[N - 1][M - 1]);

    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        visited[i][j] = true;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            for(int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && y >= 0 && x < N && y < M) {
                    if(!visited[x][y] && maze[x][y] != 0) {
                        visited[x][y] = true;
                        maze[x][y] = maze[now[0]][now[1]] + 1;
                        queue.add(new int[] {x, y});
                    }
                }
            }
        }
    }
}