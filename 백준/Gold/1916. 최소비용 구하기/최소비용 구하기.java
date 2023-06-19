import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static int N, M;
    public static int[] distance;
    public static boolean[] visited;
    public static ArrayList<Edge> list[];
    public static PriorityQueue<Edge> q = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        distance = new int[N + 1];
        visited = new boolean[N + 1];
        list = new ArrayList[N + 1];

        for(int i = 0; i <= N; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[s].add(new Edge(e, cost));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        q.add(new Edge(start, 0));
        distance[start] = 0;

        while(!q.isEmpty()) {
            Edge current = q.poll();
            int c_v = current.vertex;
            if(!visited[c_v]) {
                visited[c_v] = true;
                for(Edge e : list[c_v]) {
                    if(!visited[e.vertex] && distance[e.vertex] > distance[c_v] + e.cost) {
                        distance[e.vertex] = distance[c_v] + e.cost;
                        q.add(new Edge(e.vertex, distance[e.vertex]));
                    }
                }
            }
        }
        System.out.println(distance[end]);
    }

    static class Edge implements Comparable<Edge> {

        int vertex, cost;

        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e) {
            if (this.cost > e.cost) return 1;
            else return -1;
        }
    }

}