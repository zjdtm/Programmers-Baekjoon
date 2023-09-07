import java.util.*;

class Solution {

        static int[] dx = {1, 0, -1, 0};
        static int[] dy = {0, 1, 0, -1};
        static int[][] visited;

        public int solution(int[][] maps) {
            int answer = 0;

            visited = new int[maps.length][maps[0].length];
            BFS(maps, visited);
            answer = visited[maps.length - 1][maps[0].length - 1];

            return answer == 0 ? -1 : answer;
        }

        static void BFS(int[][] maps, int[][] visited) {
            int x = 0;
            int y = 0;
            visited[x][y] = 1;
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{x, y});

            while(!queue.isEmpty()) {
                int[] current = queue.poll();
                int cx = current[0];
                int cy = current[1];

                for (int i = 0; i < 4; i++) {
                    int nx = cx + dx[i];
                    int ny = cy + dy[i];

                    if(nx < 0 || nx > maps.length - 1 || ny < 0 || ny > maps[0].length - 1)
                        continue;

                    if(visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                        visited[nx][ny] = visited[cx][cy] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }