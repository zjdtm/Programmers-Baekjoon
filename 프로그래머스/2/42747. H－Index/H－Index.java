import java.util.*;

class Solution {
    private boolean isValid(int[] citation, int h) {
        int index = citation.length - h;
        return citation[index] >= h;
    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int h = citations.length; h >= 1; h--) {
            if (isValid(citations, h)) return h;
        }
        return 0;
    }
}