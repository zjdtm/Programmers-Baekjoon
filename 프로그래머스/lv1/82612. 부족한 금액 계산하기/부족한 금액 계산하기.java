class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;

        for(long i = 1; i <= count; i++) {
            sum += price * i;
        }

        return (money - sum) >= 0 ? 0 : Math.abs(money - sum);
    }
}