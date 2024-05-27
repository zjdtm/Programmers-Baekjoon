class Solution {
    boolean solution(String s) {
        String target = s.toLowerCase();
            int pCount = target.length() - target.replace("p", "").length();
            int yCount = target.length() - target.replace("y", "").length();

            return pCount == yCount;
    }
}