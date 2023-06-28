import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] tree;
    static int result;
    static int deleteNode;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        tree = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            tree[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int root = 0;
        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(n != -1) {
                tree[i].add(n);
                tree[n].add(i);
            } else {
                root = i;
            }
        }

        deleteNode = Integer.parseInt(br.readLine());
        if(deleteNode == root)
            System.out.println(0);
        else {
            DFS(root);
            System.out.println(result);
        }
    }

    private static void DFS(int number) {
        visited[number] = true;
        int cNode = 0;
        for(int i : tree[number]) {
            if(!visited[i] && i != deleteNode) {
                cNode++;
                DFS(i);
            }
        }
        if(cNode == 0)
            result++;
    }
}