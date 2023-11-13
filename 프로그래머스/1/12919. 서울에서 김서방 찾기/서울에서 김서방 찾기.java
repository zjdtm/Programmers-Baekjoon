import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();

        int index = Arrays.asList(seoul).indexOf("Kim");
        sb.append("김서방은 ").append(index).append("에 있다");

        return sb.toString();
    }
}