class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
            int changeBinary = 0;
            int zeroCount = 0;

            while (!s.equals("1")) {
                String replaced = s.replaceAll("0", "");

                zeroCount += s.length() - replaced.length();
                int replacedLength = replaced.length();
                s = Integer.toString(replacedLength, 2);
                changeBinary++;
            }

            answer[0] = changeBinary;
            answer[1] = zeroCount;

            return answer;
    }
}