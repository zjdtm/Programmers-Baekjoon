import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//이분그래프
public class Main {

    static ArrayList<Integer>[] A;
    static int[] check;
    static boolean[] visited;
    static boolean IsEven;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] s = br.readLine().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            A = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            IsEven = true;

            for (int j = 1; j <= V; j++) {
                A[j] = new ArrayList<>();
            }
            for (int k = 0; k < E; k++) {
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                A[start].add(end);
                A[end].add(start);
            }

            for (int l = 1; l <= V; l++) {
                if (IsEven)
                    DFS(l);
                else
                    break;
            }

            if (IsEven) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static void DFS(int start) {
        visited[start] = true;
        for (int i : A[start]) {
            if (!visited[i]) {
                check[i] = (check[start] + 1) % 2;
                DFS(i);
            } else if (check[start] == check[i]) {
                IsEven = false;

            }
        }
    }
    
}