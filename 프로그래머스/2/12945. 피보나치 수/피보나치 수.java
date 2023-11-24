import java.util.*;
class Solution {
    private final int[] mem = new int[100001];
    
    private int fibonacci(int n) {
        if (mem[n] != -1) return mem[n];

        if (n == 0 || n == 1) return n;

        return mem[n] = (fibonacci(n - 2) + fibonacci(n - 1)) % 1234567;
    }
    
    public int solution (int n) {
        Arrays.fill(mem, -1);
        for (int i = 0; i <= n; i++) {
            fibonacci(n);
        }
        return fibonacci(n);
    }
}