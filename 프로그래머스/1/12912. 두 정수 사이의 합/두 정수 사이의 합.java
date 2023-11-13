import java.util.stream.*;
class Solution {
    public long solution(int a, int b) {
        long a1 = a;
        long b1 = b;
        return LongStream.rangeClosed(Math.min(a1, b1), Math.max(a1, b1)).sum();
    }
}