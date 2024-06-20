import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[] arr;
    private static int N, K, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[K];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        recur(0);
        System.out.println(result);

    }

    private static void recur(int sum) {
        if (sum > N) return;
        if (result < sum) result = sum;

        for (int i = K - 1; i > -1; i--) {
            recur(sum * 10 + arr[i]);
        }

    }


}