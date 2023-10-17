class Solution {
    private char push(char c, int n) {
        // 알파벳이 아니라면 그대로 반환
        if (!Character.isAlphabetic(c)) return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (position + offset);

    }
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(push(c, n));
        }

        return sb.toString();
    }
}