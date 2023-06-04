class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int x_true = 0;
        int x_false = 0;

        for (int i = 0; i < s.length(); i++) {
            if (x_true == x_false) {
                answer++;
                x = s.charAt(i);
            }

            if (s.charAt(i) == x)
                x_true++;
            else
                x_false++;
        }
        return answer;
    }
}