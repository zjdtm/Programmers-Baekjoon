import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(target, A)).append("\n");
        }

        System.out.println(sb);
    }

    private static int binarySearch(int target, int[] A) {
        int start = 0;
        int end = A.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(target > A[mid]) {
                start = mid + 1;
            }else if(target < A[mid]) {
                end = mid - 1;
            }else {
                return 1;
            }
        }
        return 0;
    }
}