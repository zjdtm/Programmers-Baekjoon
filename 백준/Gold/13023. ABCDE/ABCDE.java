import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {

    private static ArrayList<Integer>[] A;
    private static boolean[] visited;
    private static boolean arrive;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N];
        visited = new boolean[N];
        arrive = false;

        for(int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }

        for(int i = 0; i < N; i++) {
            DFS(i, 1);

            if(arrive) {
                break;
            }
        }

        if(arrive) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    private static void DFS(int now, int depth) {
        if(depth == 5 || arrive){
            arrive = true;
            return;
        }

        visited[now] = true;
        for(int i : A[now]) {
            if(!visited[i]) {
                DFS(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}