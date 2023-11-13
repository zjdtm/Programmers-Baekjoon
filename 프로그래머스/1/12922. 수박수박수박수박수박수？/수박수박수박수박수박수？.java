import java.util.*;
class Solution {
    public String solution(int n) {
        String str1 = "수";
        String str2 = "박";
        int idx = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (idx % 2 == 0) {
                sb.append(str1);
            } else {
                sb.append(str2);
            }
            idx++;
        }

        return sb.toString();
    }
}