import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int N;
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[N + 1];
        list = new ArrayList[N + 1];
        answer = new int[N + 1];
        for(int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 1; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        DFS(1);

        for(int i = 2; i <= N; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void DFS(int i) {
        visited[i] = true;
        for(int j : list[i]) {
            if(!visited[j]) {
                answer[j] = i;
                DFS(j);
            }
        }
    }
}