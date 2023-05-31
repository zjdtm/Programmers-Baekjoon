import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 효율적인 해킹
public class Main {

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int N, M;
    static int answer[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        answer = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
        }

        for(int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            BFS(i);
        }

        int maxVal = 0;
        for(int i = 1; i <= N; i++) {
            maxVal = Math.max(maxVal, answer[i]);
        }

        for(int i = 1; i <= N; i++) {
            if(answer[i] == maxVal)
                System.out.print(i + " ");
        }
    }
    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(Node);
        visited[Node] = true;
        while(!queue.isEmpty()) {
            int now_Node = queue.poll();
            for(int i : A[now_Node]) {
                if(!visited[i]) {
                    visited[i] = true;
                    answer[i]++;
                    queue.add(i);
                }
            }
        }
    }
}