class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] alphabet = new String[]{
                "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"
        };

        for(int i = 0; i < 10; i++) {
            s = s.replaceAll(alphabet[i], String.valueOf(i));
        }

        int count = 1;
        for(int i = s.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(String.valueOf(s.charAt(i)));
            answer += number * count;
            count *= 10;
        }

        return answer;
    }
}