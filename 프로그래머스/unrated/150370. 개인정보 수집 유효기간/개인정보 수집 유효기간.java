import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> termsMap = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        for (String term : terms) {
            String[] s = term.split(" ");
            termsMap.put(s[0], Integer.parseInt(s[1]));
        }

        int number = 1;
        int todayTotalTerms = getTotalDate(today, 0);
        for(String p : privacies) {
            String[] date = p.split(" ");

            String pDate = date[0];

            int ptotalTerms = getTotalDate(pDate, termsMap.get(date[1])) - 1;

            if(ptotalTerms < todayTotalTerms) {
                answer.add(number);
            }

            number++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static Integer getTotalDate(String date, Integer term) {
        String[] s = date.split("\\.");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]) + term;
        int d = Integer.parseInt(s[2]);

        return (y * 12 * 28) + (m * 28) + d;
    }
}
