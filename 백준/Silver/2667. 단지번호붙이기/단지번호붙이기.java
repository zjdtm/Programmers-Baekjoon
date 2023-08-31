import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int N;
    static int homeCount;
    static int[][] map;
    static int dx[] = new int[]{1, 0, -1, 0};
    static int dy[] = new int[]{0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] numbers = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        ArrayList<Integer> homes = new ArrayList<>();
        int danjisu = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                homeCount = 0;
                if (map[i][j] != 0) {
                    DFS(i, j);
                    danjisu++;
                    homes.add(homeCount);
                }
            }
        }

        System.out.println(danjisu);
        Collections.sort(homes);
        for (int homeCount : homes) {
            System.out.println(homeCount);
        }
    }

    static void DFS(int x, int y) {
        map[x][y] = 0;
        homeCount += 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] != 0)
                DFS(nx, ny);
        }
    }

}