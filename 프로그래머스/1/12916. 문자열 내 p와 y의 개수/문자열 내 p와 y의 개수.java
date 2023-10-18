class Solution {
    boolean solution(String s) {
        int pCount = 0;
            int yCount = 0;
            s = s.toLowerCase();

            if (!s.contains("p") && !s.contains("y")) {
                return true;
            }

            for (String str : s.split("")) {
                if (str.equals("p")) {
                    pCount++;
                } else if (str.equals("y")) {
                    yCount++;
                }
            }

            return pCount == yCount;
    }
}