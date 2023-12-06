import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int discount_match_day = 10;
        List<String> wantLists = new ArrayList<>();

        for (int i = 0; i < want.length; i++) {
            while (number[i] --> 0) {
                wantLists.add(want[i]);
            }
        }

        for (int i = 0; i < discount.length - discount_match_day + 1; i++) {
            List<String> buyLists = new ArrayList<>(wantLists);
            for (int j = i; j < discount_match_day + i; j++) {
                if (!buyLists.contains(discount[j])) {
                    continue;
                }else {
                    buyLists.remove(discount[j]);
                }
            }
            answer += buyLists.size() == 0 ? 1 : 0;
        }

        return answer;
    }
}