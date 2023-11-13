class Solution {
    public int solution(String s) {
        if (s.contains("-")) {
            String[] str = s.split("-");
            return -Integer.parseInt(str[1]);
        } else if (s.contains("+")){
            String[] str = s.split("\\+");
            return +Integer.parseInt(str[1]);
        } else {
            return Integer.parseInt(s);
        }
    }
}