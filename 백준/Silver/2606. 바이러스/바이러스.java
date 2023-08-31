import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] computers;
    static boolean[] visited;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int computerCount = Integer.parseInt(br.readLine());
        int networkCount = Integer.parseInt(br.readLine());
        computers = new ArrayList[computerCount + 1];
        visited = new boolean[computerCount + 1];

        for (int i = 1; i <= computerCount; i++) {
            computers[i] = new ArrayList<>();
        }

        for (int i = 0; i < networkCount; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            computers[s].add(e);
            computers[e].add(s);
        }

        DFS(1);

        System.out.println(result);
    }

    static void DFS(int number) {
        if (!visited[number]) {
            visited[number] = true;
        }
        for (int i : computers[number]) {
            if (!visited[i]) {
                result++;
                DFS(i);
            }
        }
    }

}