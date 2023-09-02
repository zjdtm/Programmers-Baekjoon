import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    private static ArrayList<Integer>[] A;
    private static boolean[] visited;

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       // 노드의 개수
        int M = Integer.parseInt(st.nextToken());       // 에지의 개수
        int V = Integer.parseInt(st.nextToken());       // 시작 노드 번호

        A = new ArrayList[N + 1];                       // A 는 인접 리스트로 N + 1로 한 이유는 인덱스 번호를 1부터 시작하기 위해서
        visited = new boolean[N + 1];                   // 방문 배열을 체크해주는 배열

        for(int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            A[start].add(end);                              // 인접 리스트에 start 번째에는 end 를 end 번째에는 start 를
            A[end].add(start);                              // 양쪽에 넣어준다.
        }

        for(int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        DFS(V);
        visited = new boolean[N + 1];
        sb.append("\n");
        BFS(V);
        System.out.println(sb);



    }

    private static void DFS(int V) {
        if(!visited[V]) {               // 방문했던 노드인지 체크하는 조건문
            sb.append(V + " ");         // 방문한 노드를 StringBuilder 에 저장
            visited[V] = true;          // 방문한 노드는 체크
            for(int i : A[V]) {         // 인접한 노드를 for 문으로 확인
                if(!visited[i]) {       // 방문하지 않았던 노드이면 DFS 재귀함수로 호출
                    DFS(i);
                }
            }
        }
    }

    private static void BFS(int V) {
        Queue<Integer> queue = new LinkedList<>();  // BFS 알고리즘을 사용하기 위한 큐 생성
        queue.add(V);                               // 탐색할 노드를 큐에 삽입 후 방문 배열을 true 로 바꿔줌
        visited[V] = true;

        while(!queue.isEmpty()) {                   // 큐가 비어있을 떄까지 while 문으로 반복
            int now = queue.poll();                 // 큐에 있는 값을 poll 하고 StringBuilder 에 추가
            sb.append(now + " ");
            for(int i : A[now]) {                   // poll 한 값에 인접 노드를 살펴 보면서 큐에 삽입하고 방문 배열을
                if(!visited[i]) {                   // true 로 바꿔줌
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }

}