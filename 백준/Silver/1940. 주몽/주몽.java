import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int start = 0;
        int end = N - 1;
        int count = 0;
        while(start<end){
            if(A[start] + A[end] < M){
                start++;
            }else if(A[start] + A[end] > M){
                end--;
            }else{
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
        bf.close();
    }
}
