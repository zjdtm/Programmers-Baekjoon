import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int visited[];
    static ArrayList<Integer>[] A;
    static int N, M, K, X;
    static List<Integer> answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];

        answer = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            A[start].add(end);
        }

        visited = new int[N + 1];
        for(int i = 0; i <= N; i++) {
            visited[i] = -1;
        }

        BFS(X);
        for(int i = 0; i <= N; i++) {
            if(visited[i] == K)
                answer.add(i);
        }
        if(answer.isEmpty())
            System.out.println("-1");
        else {
            Collections.sort(answer);
            for(int temp : answer) {
                System.out.println(temp);
            }
        }

    }

    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(Node);
        visited[Node]++;
        while(!queue.isEmpty()) {
            int now_Node = queue.poll();
            for(int i : A[now_Node]) {
                if(visited[i] == -1) {
                    visited[i] = visited[now_Node] + 1;
                    queue.add(i);
                }
            }
        }
    }
}